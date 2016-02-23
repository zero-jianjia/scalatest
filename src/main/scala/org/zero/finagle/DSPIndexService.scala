package org.zero.finagle

import java.util.concurrent.Executors

import com.google.protobuf.Message
import com.twitter.app.GlobalFlag
import com.twitter.concurrent.NamedPoolThreadFactory
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.util.{InetSocketAddressUtil, DefaultTimer}
import com.twitter.finagle.{Service, Codec, CodecFactory}
import com.twitter.jvm.numProcs
import com.twitter.util.{Future, Await}
import com.zero.proto.PersonData.Person
import org.jboss.netty.channel.socket.nio.{NioServerSocketChannelFactory, NioClientSocketChannelFactory, NioWorkerPool}
import org.jboss.netty.channel.{ServerChannelFactory, Channels, ChannelPipelineFactory}
import org.zero.finagle.SaxParam._
import com.twitter.conversions.time._

/**
  * Created by jianjia1 on 2016/2/17.
  */
object DSPIndexService {
    def main(args: Array[String]) {
        //Config.localIp + ":" + Config.getPort(SAX_BrandAndPd)
        val Seq(ia) = InetSocketAddressUtil.parseHosts("127.0.0.1:8845")
        val server = ServerBuilder()
                .codec(new DSPCodec())
                .hostConnectionMaxLifeTime(5.minutes)
                .name("zero")
                .keepAlive(true)
//                .channelFactory(SaxParam.serverchannelFactory)

                .bindTo(ia)
                .build(new EngineService)
        Await.result(server)
    }
}

object SaxParam {
    val Executor = Executors.newCachedThreadPool(
        new NamedPoolThreadFactory("finagle/netty3_12", true /*daemon*/))

    object numWorkers extends GlobalFlag(numProcs().ceil.toInt, "Size of netty3 worker pool")

    object WorkerPool extends NioWorkerPool(Executor, numWorkers())

//    val channelFactory: NettyChannelFactory = new NioClientSocketChannelFactory(
//        Executor, 1 /*# boss threads*/ , WorkerPool, DefaultTimer) {
//        override def releaseExternalResources() = () // no-op; unreleasable
//    }

    val serverchannelFactory: ServerChannelFactory =
        new NioServerSocketChannelFactory(Executor, WorkerPool) {
            override def releaseExternalResources() = () // no-op
        }
}

class EngineService extends Service[(String, Message), (String, Message)] {
    def apply(req: (String, Message)) = {
        //ServerCounter.count(SAX_BrandAndPd)
        req._1 match {
            case "msg" =>
                RequestHandler(req._2.asInstanceOf[Person])
            case _ =>
                Future.value(("msg", Person.getDefaultInstance))
        }
    }
}

object RequestHandler {
    def apply(data: Person): Future[(String, Message)] = {
        try {
            println(data)
            println(data.getId)
            Future.value(("msg", Person.getDefaultInstance))
        } catch {
            case e: Throwable =>
                Future.value(("msg", Person.getDefaultInstance))
        }
    }
}

class DSPCodec extends CodecFactory[(String, Message), (String, Message)] {
    def client = config =>
        new Codec[(String, Message), (String, Message)] {
            def pipelineFactory: ChannelPipelineFactory = new ChannelPipelineFactory {
                def getPipeline = {
                    val pipeline = Channels.pipeline()
                    pipeline.addLast("encoder", new CustomProtobufEncoder(Dsp.repo))
                    pipeline.addLast("decoder", new CustomProtobufDecoder(Dsp.repo))
                    pipeline
                }
            }
        }

    def server = { config =>
        new Codec[(String, Message), (String, Message)] {
            def pipelineFactory: ChannelPipelineFactory = new ChannelPipelineFactory {
                def getPipeline = {
                    val pipeline = Channels.pipeline()
                    pipeline.addLast("decoder", new CustomProtobufDecoder(Dsp.repo))
                    pipeline.addLast("encoder", new CustomProtobufEncoder(Dsp.repo));
                    pipeline
                }
            }
        }
    }
}