package com.easy;

import java.util.HashMap;

public class TwoSumLessThanK {
    public int twoSumLessThan(int[] A, int K){
        HashMap<Integer,Integer> hm = new HashMap<>();
        int res = -1;
        for(int j =0; j<A.length; j++) {
            if (hm.isEmpty())
                hm.put(j, A[j]);

            for (int i : hm.keySet()) {
                if (hm.get(i) + A[j] < K) {
                    res = Math.max(res, hm.get(i)+A[j]);
                }
            }
            hm.put(j,A[j]);
        }
        return res;
    }
}