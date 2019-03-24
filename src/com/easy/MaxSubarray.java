package com.easy;

public class MaxSubarray {
    public int maxSubArray(int[] nums) {
        int sum=0;
        int max = Integer.MIN_VALUE;
        if(sum < 0)
            return 0;

        for(int i=0; i<nums.length; i++){
            sum = sum + nums[i];
            sum = Math.max(sum,nums[i]);


            if(sum > max)
                max = sum;


        }


        return max;
    }
}