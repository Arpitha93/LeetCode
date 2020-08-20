package com.medium;

import java.util.ArrayList;

public class DesignHitCounter {
    ArrayList<Integer> hits;

    public void hit(int timestanp){
        hits.add(timestanp);
    }

    public int getHits(int timestamp) {
        int count = 0;
        int startRange = timestamp - 300 < 0 ? 0 : timestamp - 300;

        for (int hit:hits) {
            if (hit > startRange)
                count++;
        }
        return count;
    }
}