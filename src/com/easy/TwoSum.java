package com.easy;

import java.util.HashMap;

public class TwoSum {
    public  static int[] twoSum(int[] nums, int target) {
        // int index = new int[][];

//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if ((i != j) && (nums[i] + nums[j]) == target) {
//                    // return index[i][j];
//                    return new int[]{i, j};
//                }
//            }
//        }
//        return nums;
        HashMap<Integer, Integer> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
//             if(!hm.containsKey(nums[i]))
//                 hm.put(nums[i],0);

//             hm.put(nums[i], hm.get(nums[i])+1);
            int result = target - nums[i];
            if (hm.containsKey(result)) {
                return new int[]{hm.get(result), i};
            }
            hm.put(nums[i], i);
        }

        return new int[]{};
    }
}