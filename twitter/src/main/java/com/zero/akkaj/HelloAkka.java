package com.zero.akkaj;

import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;

import java.util.concurrent.TimeUnit;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class HelloAkka {
    public static void main(String[] args) {
        ActorSystem actorSystem = ActorSystem.create("helloakka");
        ActorRef master = actorSystem.actorOf(Props.create(MasterActor.class),"master");

        master.tell("hadoop, flume, zookeeper", null);
        master.tell("hadoop, flume, spark", null);
        master.tell("scala, flume, spark", null);

        try {
            TimeUnit.SECONDS.sleep(3);
            
            master.tell(new Result(), null);
            TimeUnit.SECONDS.sleep(3);

            actorSystem.shutdown();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
