package com.zero.akkaj;

import akka.actor.ActorRef;
import akka.actor.UntypedActor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class MapActor extends UntypedActor {
    private ActorRef reduceActor = null;

    public MapActor(ActorRef reduceActor) {
        this.reduceActor = reduceActor;
    }
    
    @Override
    public void onReceive(Object message) throws Exception {
        if (message instanceof String) {
            System.out.println("MapActor receice : " + message);
            String content = (String) message;
            MapData mapData = toMapData(content);
            reduceActor.tell(mapData, null);
        }else {
            unhandled(message);
        }
    }
    
    private MapData toMapData(String content){
        List<WordCount> dataList = new ArrayList<>();
        String[] words = content.split(",");
        for (String word : words) {
            dataList.add(new WordCount(word, 1));
        }
        return new MapData(dataList);
    }
}
