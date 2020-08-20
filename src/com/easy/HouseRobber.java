package com.easy;

public class HouseRobber {
    public int rob(int[] nums) {
//        int highest = 0;
//        if(nums.length == 0)
//            return 0;
//
//        if(nums.length == 2){
//            return Math.max(nums[0], nums[1]);
//        }
//        else if(nums.length == 3)
//            return Math.max(nums[0] + nums[2], nums[1]);
//
//        for(int i = 0; i<nums.length; i+=2){
//            highest += Math.max(nums[i], nums[i+1]);
//
//        }
//        return highest;

        if (nums.length == 0)
            return  0;

        if (nums.length == 1)
            return nums[0];

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        int i=2;
        for (i=2; i<nums.length; i++)
            dp[i] = Math.max(dp[i-1], dp[i-2]+nums[i]);

        return dp[i-1];
    }
}