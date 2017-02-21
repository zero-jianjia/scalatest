package org.zero.finagle

import java.net.URLEncoder
import java.nio.charset.Charset

import com.twitter.finagle.Service
import com.twitter.finagle.builder.ClientBuilder
import com.twitter.finagle.http._
import org.jboss.netty.handler.codec.http._

/**
  * Created by jianjia1 on 17/02/14.
  */
object SnapClient {
    def main(args: Array[String]) {
        val client: Service[Request, Response] = ClientBuilder()
            .codec(Http())
//            .hosts("10.13.88.48:8080")
            .hosts("10.236.65.21:9200")
             .hostConnectionCoresize(2)
            .hostConnectionLimit(5)
            .build()

//        var url = "?shotUrl=" +"http://slide.astro.sina.com.cn/slide_52_42283_38693.html#p=1" +"&filePath=/usr/home/jianjia1/phantomjs/afd.png";
//                var url = "?shotUrl=" +"http://www.jd.com/" +"&filePath=/usr/home/jianjia1/phantomjs/afd.png";

//        var url = "?backurl=http%3A%2F%2F10.237.63.100%3A9876%2FscreenBack.action%3Fext%3D123456&cuturl=http://slide.astro.sina.com.cn/slide_52_42283_38693.html#p=1"
//        val request = Request(Version.Http11, Method.Get, "/screenshot/sax"+url)

        var url = "?url=http://www.jd.com"
        val request = Request(Version.Http11, Method.Get, "/screenshot/ywy"+url)

        println(request.uri)

        for(i <- 0 until 1){
            var start = System.currentTimeMillis()

            client(request) onSuccess { response =>
                val responseString = response.contentString
                print("))) Received result for authorized request: " + responseString)
                println(System.currentTimeMillis() - start)
            } /*ensure {
                client.close()
            }*/
        }

        //        // When both request1 and request2 have completed, close the TCP connection(s).
        //        /*(*/request1 /*join request2)*/ ensure {
        //            client.close()
        //        }
    }
}
