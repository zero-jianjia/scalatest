package com.zero.akkaj;

import java.util.List;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class MapData {
    private List<WordCount> dataList;

    public MapData(List<WordCount> dataList) {
        this.dataList = dataList;
    }

    public List<WordCount> getDataList() {
        return dataList;
    }

    public void setDataList(List<WordCount> dataList) {
        this.dataList = dataList;
    }
}
