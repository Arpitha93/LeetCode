package com.easy;

import java.util.Arrays;

public class MaxProductofThreeNum {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int product = nums[n-1] * nums[n-2] * nums[n-3];

        if (nums[1] >= 0) {
            return product;
        } else
            return Math.max(product, nums[0] * nums[1] * nums[n-1]);
    }
}