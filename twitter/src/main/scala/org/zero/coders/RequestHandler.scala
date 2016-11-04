package org.zero.coders

import com.google.protobuf.Message
import com.twitter.util.Future
import com.zero.proto.IndexSearchData.IndexRequest
import com.zero.proto.PersonData.Person


object RequestHandler {
    def apply(request: IndexRequest): Future[(String, Message)] = {
        try {

            Future.value((MsgHead.RESPONSE, Person.getDefaultInstance))
        } catch {
            case ex: Throwable =>
                Future.value((MsgHead.RESPONSE, Person.getDefaultInstance))
        }
    }
}

