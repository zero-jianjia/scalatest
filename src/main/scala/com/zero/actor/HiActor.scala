package com.zero.actor

import scala.actors.Actor._
object HiActor {
    def main(args: Array[String]): Unit = {
        val actor1 = actor {
            while (true) {
                receive {
                    case "Hi" => println("msg")
                }
            }
        }
        val replyFuture = actor1 !! "Hi"
        
        val replys = replyFuture()
        
    }
}