package org.zero.coders

import com.google.protobuf.Message
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

        val (head, message )= msg.asInstanceOf[Tuple2[String, Message]]

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







