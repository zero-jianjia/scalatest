//package org.zero.finagle
//
//import java.util.concurrent.{TimeUnit, Executors}
//
//import com.google.protobuf.Message
//import com.sina.sax.SaxCodec
//import com.sina.sax.SaxParam
//import com.sina.sax.SaxParam._
//import com.sina.sax._
//import com.sina.sax.const.Const._
//import com.sina.sax.const.SaxName
//import com.sina.sax.protocol.CustomProtobufDecoder
//import com.sina.sax.protocol.CustomProtobufEncoder
//import com.sina.sax.service.sinaengine.PreferredDealService._
//import com.twitter.app.GlobalFlag
//import com.twitter.concurrent.NamedPoolThreadFactory
//import com.twitter.finagle.util.DefaultTimer
//import com.twitter.finagle.{Codec, CodecFactory, Service}
//import com.twitter.finagle.builder.ServerBuilder
//import com.twitter.finagle.zipkin.thrift.ZipkinTracer
//import com.twitter.util.{Duration, Await, Future}
//import com.zero.proto.ProtoBufferVO
//import org.jboss.netty.channel.socket.nio.{NioServerSocketChannelFactory, NioClientSocketChannelFactory, NioWorkerPool}
//import org.jboss.netty.channel.{ServerChannelFactory, ChannelFactory, Channels, ChannelPipelineFactory}
//
///**
//  * Created by jianjia1 on 2016/2/22.
//  */
//object Service {
//    def main(args: Array[String]) {
//        val server = ServerBuilder()
//                .codec(new SaxCodec())
//                .hostConnectionMaxLifeTime(5.minutes)
//                .name("zero")
//                .keepAlive(true)
//                .channelFactory(SaxParam.serverchannelFactory)
//                .bindTo("1000")
//                .build(service)
//        init(service)
//        initMonitorServer(SAX_BrandAndPd)
//        Await.result(server)
//    }
//}
//
//
//
//
//
//
//class EngineService extends Service[(String, Message), (String, Message)] {
//    def apply(req: (String, Message))= {
//        //ServerCounter.count(SAX_BrandAndPd)
//        req._1 match {
//            case "msg" =>
//                RequestHandler(req._2.asInstanceOf[ProtoBufferVO])
//            case _ =>
//                Future.value(("Error", ProtoBufferVO.Order.getDefaultInstance))
//        }
//    }
//}
//
