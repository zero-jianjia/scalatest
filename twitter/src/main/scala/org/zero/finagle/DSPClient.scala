package org.zero.finagle

import java.net.InetSocketAddress

import com.google.protobuf.Message
import com.twitter.finagle.{SimpleFilter, Service}
import com.twitter.finagle.builder.ClientBuilder
import com.twitter.util.{Await, Future}
import com.zero.proto.PersonData.Person
import org.zero.finagle.HttpClient.InvalidRequest

/**
  * Created by jianjia1 on 2016/2/22.
  */
object DSPClient {
    def main(args: Array[String]) {
        val clientWithoutErrorHandling: Service[(String, Message), (String, Message)] = ClientBuilder()
                .codec(new DSPCodec())
                .hosts("127.0.0.1:8845")
                .hostConnectionLimit(1)
                .build()

        val handleErrors = new HandleErrors

        // compose the Filter with the client:
        val client: Service[(String, Message), (String, Message)] = handleErrors andThen clientWithoutErrorHandling

        val request1 = makeRequest(client)
        println("end")
    }

    private[this] def makeRequest(client: Service[(String, Message), (String, Message)]) = {
        val vo = Person.newBuilder().setId(125L).setName("jian").build()
        val request = ("msg", vo)

        val resf = client(request) onSuccess { response =>
//                println(response)
            println(response._1)
        }
        val res = Await.result(resf)
    }
}

class HandleErrors extends SimpleFilter[(String, Message), (String, Message)] {
    def apply(request: (String, Message), service: Service[(String, Message), (String, Message)]) = {
        // flatMap asynchronously responds to requests and can "map" them to both
        // success and failure values:
        //        service(request) flatMap { response =>
        //            response.status match {
        //                case Status.Ok => Future.value(response)
        //                case Status.Forbidden => Future.exception(new InvalidRequest)
        //                case _ => Future.exception(new Exception(response.status.reason))
        //            }
        service(request) onFailure (e =>{
            Future.value(("msg", Person.getDefaultInstance))
        })
    }
}
