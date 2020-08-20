package com.easy;

public class FindPivotIndex {
    public int pivotIndex(int[] nums) {
        int sum = 0;
        int pivot = 0;
        for (int n : nums) {
            sum += n;
        }

        for (int i = 0; i < nums.length; i++) {
            if (pivot == sum - pivot - nums[i]) {
                return i;
            }
            pivot += nums[i];
        }
        return -1;
    }
}