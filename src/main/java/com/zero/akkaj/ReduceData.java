package com.zero.akkaj;

import java.util.Map;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class ReduceData {
    private Map<String, Integer> reduceDataList;

    public ReduceData(Map<String, Integer> reduceDataList) {
        this.reduceDataList = reduceDataList;
    }

    public Map<String, Integer> getReduceDataList() {
        return reduceDataList;
    }
}
