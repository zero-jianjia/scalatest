package org.zero.coders

import org.jboss.netty.buffer.{ChannelBuffer, ChannelBufferInputStream}
import org.jboss.netty.channel.{Channel, ChannelHandlerContext}
import org.jboss.netty.handler.codec.frame.FrameDecoder

/**
  * 解码器
  *
  * 服务器端和客户端用用样的解码器，
  **/
class CustomProtobufDecoder extends FrameDecoder {

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

    @throws(classOf[Exception])
    def decode(ctx: ChannelHandlerContext, channel: Channel, buf: ChannelBuffer): Object = {
        if (buf.readableBytes() < 8) {
            return null
        }

        buf.markReaderIndex()

        val headCode = buf.readInt()
        val protobufLen = buf.readInt()

        // do we have enough bytes to decode the message?
        if (buf.readableBytes() < protobufLen) {
            buf.resetReaderIndex();
            return null;
        }

        val (headStr, protoType) = MsgHead.getHeadStrAndProtoType(headCode)

        val protogBuf = buf.readBytes(protobufLen);
        def message = protoType.newBuilderForType().mergeFrom(
            new ChannelBufferInputStream(protogBuf)).buildPartial()

        (headStr, message)
    }
}
