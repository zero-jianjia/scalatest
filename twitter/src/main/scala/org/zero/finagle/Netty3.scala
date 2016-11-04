package org.zero.finagle

import com.google.protobuf.Message
import com.zero.proto.PersonData.Person
import org.jboss.netty.buffer.{ChannelBuffer, ChannelBufferInputStream, ChannelBuffers}
import org.jboss.netty.channel._
import org.jboss.netty.handler.codec.frame.FrameDecoder
import org.jboss.netty.handler.codec.oneone.OneToOneEncoder

object ProtoBufServerPipeline extends ChannelPipelineFactory {
    def getPipeline = {
        val pipeline = Channels.pipeline()
        pipeline.addLast("decoder", new CustomProtobufDecoder(Dsp.repo))
        pipeline.addLast("encoder", new CustomProtobufEncoder(Dsp.repo));
        pipeline
    }
}

    //#clientpipeline
    object ProtoBufClientPipeline extends ChannelPipelineFactory {
        def getPipeline = {
            val pipeline = Channels.pipeline()
            pipeline.addLast("encoder", new CustomProtobufEncoder(Dsp.repo))
            pipeline.addLast("decoder", new CustomProtobufDecoder(Dsp.repo))
            pipeline
        }
    }


    /**
      * 解码器
      *
      * 服务器端和客户端用用样的解码器，
      **/
    class CustomProtobufDecoder(val repo: SimpleMethodLookup) extends FrameDecoder with ProtobufDecoder {

        @throws(classOf[Exception])
        def decode(ctx: ChannelHandlerContext, channel: Channel, buf: ChannelBuffer): Object = {
            decode(ctx, channel, buf, repo)
        }

        def getPrototype(methodName: String): Message = {
            repo.lookupPrototype(methodName)
        }
    }


    /**
      * Knows how to encode a ("doSomething()", ProtobufMessage) tuple.
      *
      * Message Format
      * ==============
      *
      * Offset: 0             4                8
      * +-------------+----------------+------------------+
      * | method code | message length | protobuf message |
      * +-------------+----------------+------------------+
      *
      *
      */
    class CustomProtobufEncoder(val repo: SimpleMethodLookup) extends OneToOneEncoder {

        @throws(classOf[Exception])
        def encode(ctx: ChannelHandlerContext, channel: Channel, msg: Object): Object = {

            if (!msg.isInstanceOf[Tuple2[String, Message]]) {
                return msg
            }

            val t = msg.asInstanceOf[Tuple2[String, Message]]
            val methodNameCode = repo.encode(t._1)
            println("encode method name" + "\t" + t._1)
            val message = (t._2.asInstanceOf[Message]).toByteArray()

            val methodNameBuf = ChannelBuffers.buffer(4)
            methodNameBuf.writeInt(methodNameCode)

            val msgLenBuf = ChannelBuffers.buffer(4)
            msgLenBuf.writeInt(message.length)


            ChannelBuffers.wrappedBuffer(methodNameBuf, msgLenBuf,
                ChannelBuffers.wrappedBuffer(message))
        }
    }

    /**
      *
      * Knows how to decode a ("doSomething()", ProtobufMessage) binary message.
      *
      * Message Format
      * ==============
      *
      * Offset: 0             4                8
      * +-------------+----------------+------------------+
      * | method code | message length | protobuf message |
      * +-------------+----------------+------------------+
      *
      */

    trait ProtobufDecoder {

        def decode(ctx: ChannelHandlerContext, channel: Channel, buf: ChannelBuffer, repo: SimpleMethodLookup): Object = {

            if (buf.readableBytes() < 8) {
                return null
            }

            buf.markReaderIndex()

            val methodCode = buf.readInt()
            val msgLen = buf.readInt()

            // do we have enough bytes to decode the message?
            if (buf.readableBytes() < msgLen) {
                buf.resetReaderIndex();
                return null;
            }

            val methodName = repo.lookup(methodCode)
            val prototype = getPrototype(methodName)

            val msgBuf = buf.readBytes(msgLen);
            def message = prototype.newBuilderForType().mergeFrom(
                new ChannelBufferInputStream(msgBuf)).buildPartial()

            (methodName, message)
        }

        def getPrototype(methodName: String): Message;
    }


    /**
      * Maps method names to short codes. This particular implementation uses the trivial String.hashCode.
      */
    class SimpleMethodLookup(val methods: List[String]) {

        val codeToName = methods map (op => (createEncoding(op), op)) toMap

        val nameToCode = codeToName map {
            _.swap
        }

        def encode(methodName: String): Int = nameToCode.getOrElse(methodName, throw new NoSuchMethodException("Method: " + methodName))

        def lookup(code: Int): String = codeToName.getOrElse(code, throw new NoSuchMethodException("Code: " + code))

        def createEncoding(s: String): Int = {
            s.hashCode()
        }

        def lookupPrototype(classname: String): Message = {
            classname match {
                case "msg" => {
                    println(classname)
                    Person.getDefaultInstance
                }
                case _ => null
            }
        }
    }

    object SimpleMethodLookup {
        def apply(operation: List[String]): SimpleMethodLookup = {
            new SimpleMethodLookup(operation)
        }
    }
