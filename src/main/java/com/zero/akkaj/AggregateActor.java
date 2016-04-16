package com.zero.akkaj;

import akka.actor.UntypedActor;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class AggregateActor extends UntypedActor {
    private Map<String, Integer> finalReducedMap = new HashMap<>();

    @Override
    public void onReceive(Object message) throws Exception {
        System.out.println("AggregateActor receice : " + message);
        if (message instanceof ReduceData) {
            ReduceData reduceData = (ReduceData) message;
            for (String key : reduceData.getReduceDataList().keySet()) {
                int count = reduceData.getReduceDataList().get(key) +
                        finalReducedMap.getOrDefault(key, 0);
                finalReducedMap.put(key, count);
            }
        }else if (message instanceof Result){
            System.out.println(finalReducedMap);
        }else {
            unhandled(message);
        }
    }
}
