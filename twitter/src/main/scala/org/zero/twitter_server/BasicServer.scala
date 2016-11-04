package org.zero.twitter_server

import com.twitter.finagle.{Http, Service}
import com.twitter.finagle.http.{Request, Response, Status}
import com.twitter.server.TwitterServer
import com.twitter.util.{Await, Future}

/**
  * Created by jianjia1 on 16/11/04.
  */
object BasicServer extends TwitterServer {
    val service = new Service[Request, Response] {
        def apply(request: Request) = {
            val response = Response(request.version, Status.Ok)
            response.contentString = "hello"
            Future.value(response)
        }
    }

    def main() {
        val server = Http.serve(":8888", service)
        onExit {
            server.close()
        }
        Await.ready(server)
    }
}
