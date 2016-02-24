package org.zero.coders

import java.util

import com.google.protobuf.Message
import com.zero.proto.IndexSearchData.{IndexResponse, LineitemResp, SearchResp}
import org.jboss.netty.buffer.ChannelBuffers
import org.jboss.netty.channel._
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder

/**
  *
  * Knows how to decode a ("string", ProtobufMessage) binary message.
  *
  * Message Format
  * ==============
  *
  * Offset:
  * 0             4                8
  * +-------------+-----------------+------------------+
  * | head code | protobuf length | protobuf message |
  * +-------------+-----------------+------------------+
  */
class CustomProtobufEncoder extends OneToOneEncoder {

    @throws(classOf[Exception])
    def encode(ctx: ChannelHandlerContext, channel: Channel, msg: Object): Object = {

        if (!msg.isInstanceOf[Tuple2[String, Message]]) {
            return msg
        }

        val (head, message) = msg.asInstanceOf[Tuple2[String, Message]]

        val headCode = MsgHead.encode(head)

        val msgByte = (message.asInstanceOf[Message]).toByteArray()

        val headCodeBuf = ChannelBuffers.buffer(4)
        headCodeBuf.writeInt(headCode)

        val protoLenBuf = ChannelBuffers.buffer(4)
        protoLenBuf.writeInt(msgByte.length)

        ChannelBuffers.wrappedBuffer(headCodeBuf, protoLenBuf,
            ChannelBuffers.wrappedBuffer(msgByte))
    }
}


object test {
    def main(args: Array[String]) {
        //        SearchResp.newBuilder().setAdunitId("001").setLineitems()

        val lineitemRespList = new util.ArrayList[LineitemResp]
        for (i <- 0 to 5000) {
            lineitemRespList.add(LineitemResp.newBuilder().setLineitemId("31411" + i)
                    .setAdIds("123,144,123,411,444,443,124,765,753,23121," + i)
                    .setDirectional("v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610|v_zone:610" + i)
                    .build())
        }
        val response = SearchResp.newBuilder().setAdunitId("001").addAllLineitems(lineitemRespList).build();
        val responses = util.Arrays.asList(response, response)
        val indexResponse = IndexResponse.newBuilder().addAllResult(responses).build()

        val aa = new Array[Byte](12345)

        val msgByte = (indexResponse.asInstanceOf[Message]).toByteArray()

        val output = GZIPUtil.compress(msgByte)

        println(output.length)
        println(msgByte.length)
        println(indexResponse.toByteArray.length)
        println(indexResponse.getSerializedSize)


    }
}







