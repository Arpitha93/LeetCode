package com.easy;

import java.util.HashMap;

public class DegreeOfanArray {
    public int findShortestSubArray(int[] nums) {
        int degree = 0;
        HashMap<Integer, Integer> arrMap = new HashMap<>();

        int min_length = 0;
        HashMap<Integer, Integer> first_seen = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            first_seen.putIfAbsent(nums[i], i);
            arrMap.put(nums[i], arrMap.getOrDefault(nums[i], 0) + 1);
            if (arrMap.get(nums[i]) > degree) {
                degree = arrMap.get(nums[i]);
                min_length = i - first_seen.get(nums[i] + 1);
            } else if (arrMap.get(nums[i]) == degree) {
                min_length = Math.min(min_length, i - first_seen.get(nums[i] + 1));
            }
        }
        return min_length;
    }
}