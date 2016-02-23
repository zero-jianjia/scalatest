package org.zero.coders

import com.google.protobuf.Message
import com.twitter.finagle.{Codec, CodecFactory}
import org.jboss.netty.channel.{ChannelPipelineFactory, Channels}


class DSPCodec extends CodecFactory[(String, Message), (String, Message)] {
    def client = config =>
        new Codec[(String, Message), (String, Message)] {
            def pipelineFactory: ChannelPipelineFactory = new ChannelPipelineFactory {
                def getPipeline = {
                    val pipeline = Channels.pipeline()
                    pipeline.addLast("encoder", new CustomProtobufEncoder())
                    pipeline.addLast("decoder", new CustomProtobufDecoder())
                    pipeline
                }
            }
        }

    def server = { config =>
        new Codec[(String, Message), (String, Message)] {
            def pipelineFactory: ChannelPipelineFactory = new ChannelPipelineFactory {
                def getPipeline = {
                    val pipeline = Channels.pipeline()
                    pipeline.addLast("decoder", new CustomProtobufDecoder())
                    pipeline.addLast("encoder", new CustomProtobufEncoder());
                    pipeline
                }
            }
        }
    }
}