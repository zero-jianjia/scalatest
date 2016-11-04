package com.zero.akkaj;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class ReduceActor extends UntypedActor {
    private ActorRef aggregateActor = null;

    public ReduceActor(ActorRef aggregateActor) {
        this.aggregateActor = aggregateActor;
    }

    @Override
    public void onReceive(Object message) throws Exception {
        System.out.println("ReduceActor receice : " + message);
        if (message instanceof MapData) {
            MapData mapData = (MapData) message;
            ReduceData reduceData = reduce(mapData.getDataList());
            aggregateActor.tell(reduceData, null);
        }else {
            unhandled(message);
        }
    }

    private ReduceData reduce(List<WordCount> dataList) {
        Map<String, Integer> reduceMap = new HashMap<>();
        for (WordCount wordCount : dataList) {
            Integer value = reduceMap.getOrDefault(wordCount.getWord(), 0);
            value++;
            reduceMap.put(wordCount.getWord(), value);
        }
        return new ReduceData(reduceMap);
    }
}
