package com.zero

import com.twitter.finagle.Service
import com.twitter.finagle.builder.ClientBuilder
import com.twitter.finagle.http.{Http, Request, Response}
import org.jboss.netty.handler.codec.http._

/**
  * Created by jianjia1 on 17/02/14.
  */
class SnapClient {
    def main(args: Array[String]) {
//        val client: Service[Request, Response] = Http.client.newService("10.13.88.48:8080");
//
//        var url =
//
        val request = new DefaultHttpRequest(HttpVersion.HTTP_1_1, HttpMethod.GET, "/redis")
//
//
//        // When both request1 and request2 have completed, close the TCP connection(s).
//        /*(*/request1 /*join request2)*/ ensure {
//            client.close()
//        }
    }
}
