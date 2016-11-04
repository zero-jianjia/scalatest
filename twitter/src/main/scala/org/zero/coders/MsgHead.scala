package org.zero.coders

import com.google.protobuf.Message
import com.zero.proto.IndexSearchData

/**
  * Created by jianjia1 on 2016/2/23.
  */
object MsgHead {
    val REQUEST = "request"
    val RESPONSE = "response"

    private[this] val headMap = Map(
        "request" -> IndexSearchData.IndexRequest.getDefaultInstance,
        "response" -> IndexSearchData.IndexRequest.getDefaultInstance)

    private[this] val headCode2headStrMap = headMap.keys map (head => (head.hashCode, head)) toMap
    private[this] val headStr2headCodeMap = headMap.keys map (head => (head, head.hashCode)) toMap

    def getHeadStrAndProtoType(headCode: Int): (String, Message) = {
        val headStr = headCode2headStrMap.getOrElse(headCode, throw new IllegalArgumentException("No Such Head Exception"))
        val protoType = headMap.getOrElse(headStr, throw new IllegalArgumentException("No Such ProtoBuffer Instance"))

        (headStr, protoType)
    }

    def encode(head: String) = {
        headStr2headCodeMap.getOrElse(head, throw new IllegalArgumentException("No Such Head Exception"))
    }

}
