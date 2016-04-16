package com.zero.akkaj;

import akka.actor.ActorRef;
import akka.actor.Props;
import akka.actor.UntypedActor;
import akka.japi.Creator;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class MasterActor extends UntypedActor {
    private ActorRef aggregateActor = getContext().actorOf(
            Props.create(AggregateActor.class), "aggregate");

    private ActorRef reduceActor = getContext().actorOf(Props.create(ReduceActor.class, new Creator() {
        @Override
        public Object create() throws Exception {
            return new ReduceActor(aggregateActor);
        }
    }));

    private ActorRef mapActor = getContext().actorOf(Props.create(MapActor.class, new Creator() {
        @Override
        public Object create() throws Exception {
            return new MapActor(reduceActor);
        }
    }));


    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            System.out.println("MasterActor receice : " + message);
            mapActor.tell(message, null);
        } else if (message instanceof Result) {
            System.out.println("MasterActor receice : " + message);
            aggregateActor.tell(message, null);
        } else {
            unhandled(message);
        }
    }
}
