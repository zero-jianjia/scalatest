package org.zero.finagle

import java.net.{InetSocketAddress, SocketAddress}

import com.twitter.finagle.builder.ServerBuilder
import com.twitter.finagle.{Server, Service}
import com.twitter.util.Future
import org.jboss.netty.handler.codec.http._
import com.twitter.finagle.http.Http

/**
  * Created by jianjia1 on 2016/2/16.
  */
object RootService {
    // Define our service: OK response for root, 404 for other paths
    val rootService = new Service[HttpRequest, HttpResponse] {
        def apply(request: HttpRequest) = {
            val r = request.getUri match {
                case "/" => new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.OK)
                case _ => new DefaultHttpResponse(HttpVersion.HTTP_1_1, HttpResponseStatus.NOT_FOUND)
            }
            Future.value(r)
        }
    }

    // Serve our service on a port
    val address: SocketAddress = new InetSocketAddress(10000)

}
