package com.easy;

import java.util.HashSet;

public class KdiffPairsInArray {
    public int findPair(int[] nums, int k) {
        HashSet<Integer> pairs = new HashSet<>();
        HashSet<Integer> set = new HashSet<>();
        int count = 0;

        for (int num: nums) {
            if (pairs.contains(num))
                set.add(num);
            pairs.add(num);
        }

        for (int num : pairs) {
            if (pairs.contains(num - k))
                count++;
        }
        return count;
    }
}