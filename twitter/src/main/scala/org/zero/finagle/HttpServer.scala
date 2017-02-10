package org.zero.finagle

import com.twitter.finagle.builder.{Server, ServerBuilder}
import com.twitter.finagle.http._
import com.twitter.util.{Await, Future, Return, Throw}
import java.net.InetSocketAddress

import com.twitter.finagle.{CancelledRequestException, RequestTimeoutException, Service, SimpleFilter}

/**
  * Created by jianjia1 on 2016/2/17.
  */
object HttpServer {

    /**
      * A simple Filter that catches exceptions and converts them to appropriate
      * HTTP responses.
      */
    class HandleExceptions extends SimpleFilter[Request, Response] {
        def apply(request: Request, service: Service[Request, Response]) = {
            println("HandleExceptions apply")
            // `handle` asynchronously handles exceptions.
            service(request) handle { case error =>
                val statusCode = error match {
                    case _: IllegalArgumentException =>
                        Status.Forbidden
                    case _ =>
                        Status.InternalServerError
                }
                val errorResponse = Response(Version.Http11, statusCode)
                errorResponse.contentString = error.getStackTraceString
                println(111)
                errorResponse
            }
        }
    }

    class ExcetionCountFilter extends SimpleFilter[Request, Response] {

        override def apply(request: Request, service: Service[Request, Response]): Future[Response] = {
            println("ExcetionCountFilter apply")
            //            val rf = service.apply(request)
            val rf = service(request)
            rf respond { res =>
                println(res)
                res match {
                    case Return(rsp) =>
                        //需要判断client的状态
                        println("ExcetionCountFilter Return(rsp)")
                    case Throw(e) =>
                        println("error")
                        e match {
                            case _: RequestTimeoutException =>
                            case _: CancelledRequestException =>
                            //                            case _:TooManyWaitersException =>
                            //                            case _: ChannelException =>
                            case _ =>
                        }
                }
            }
        }
    }

    /**
      * A simple Filter that checks that the request is valid by inspecting the
      * "Authorization" header.
      */
    class Authorize extends SimpleFilter[Request, Response] {
        def apply(request: Request, continue: Service[Request, Response]) = {
            if (Some("open sesame") == request.headerMap.get(Fields.Authorization)) {
                continue(request)
            } else {
                Future.exception(new IllegalArgumentException("You don't know the secret"))
            }
        }
    }

    /**
      * The service itself. Simply echos back "hello world"
      */
    class Respond extends Service[Request, Response] {
        def apply(request: Request) = {
            val response = Response(Version.Http11, Status.Ok)
            response.charset_=("UTF-8")
            response.contentType_=("text/html")

            response.contentString = "hello<br /> world"
            //            response.setContentString("afs")
            //            response.contentString_=("heo<br /> world")
            println(request.uri)

            println("4444")
            Future.value(Response(Version.Http11, Status.SeeOther))
        }
    }

    def main(args: Array[String]) {
        val handleExceptions = new HandleExceptions
        val countFilter = new ExcetionCountFilter
        val authorize = new Authorize
        val respond = new Respond

        // compose the Filters and Service together:
        val myService: Service[Request, Response] = handleExceptions andThen countFilter andThen respond

        val server: Server = ServerBuilder()
            .codec(Http())
            .bindTo(new InetSocketAddress(8080))
            .name("httpserver")
            .build(myService)
        Await.ready(server)
    }
}
