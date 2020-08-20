package com.easy;

import java.util.HashSet;

public class MissingNumber {
    public int missingNumber(int[] nums) {
        HashSet<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            numSet.add(num);
        }

        int missingNum = nums.length + 1;
        for (int i = 0; i < missingNum; i++) {
            if (!numSet.contains(i))
                numSet.add(i);
        }

        return  -1;
    }
}