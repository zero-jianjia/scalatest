package org.zero.coders

import com.google.protobuf.Message
import com.twitter.finagle.Service
import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.util.InetSocketAddressUtil
import com.twitter.util.{Future, Await}
import com.twitter.conversions.time._
import com.zero.proto.IndexSearchData.IndexRequest
import com.zero.proto.PersonData.Person

/**
  * Created by jianjia1 on 2016/2/23.
  */
object FinagleServicer {
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

class EngineService extends Service[(String, Message), (String, Message)] {
    def apply(req: (String, Message)) = {
        req._1 match {
            case MsgHead.REQUEST =>
                RequestHandler(req._2.asInstanceOf[IndexRequest])
            case _ =>
                Future.value((MsgHead.RESPONSE, Person.getDefaultInstance))
        }
    }
}

