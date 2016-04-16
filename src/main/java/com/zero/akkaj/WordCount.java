package com.zero.akkaj;

/**
 * Created by Inuyasha on 16.04.12.
 */
public class WordCount {
    private String word;
    private int count;

    public WordCount(String word, int count) {
        this.word = word;
        this.count = count;
    }

    public String getWord() {
        return word;
    }

    public int getCount() {
        return count;
    }
}
