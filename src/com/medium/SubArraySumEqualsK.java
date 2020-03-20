package com.medium;

import java.util.HashMap;

public class SubArraySumEqualsK {
    public int subArraySum(int[] nums, int k) {
        int sum = 0;
        int subArray = 0;
        HashMap<Integer, Integer> arr_sum = new HashMap<>();
        arr_sum.put(0, 1);

        for (int i = 0; i < nums[i]; i++) {
            sum += nums[i];

            if (arr_sum.containsKey(sum-k)) {
                subArray += arr_sum.get(sum-k);
            }
            arr_sum.put(sum, arr_sum.getOrDefault(sum, 0) + 1);
        }
        return subArray;
    }
}