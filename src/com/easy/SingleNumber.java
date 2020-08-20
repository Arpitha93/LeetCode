package com.easy;

public class SingleNumber {
    public int singleNumber(int[] nums) {
        if(nums.length < 1)
            return 0;

        for(int i=0; i<nums.length; i++)
            if(nums[i] == nums[i+1])
                nums[i]+=2;


        return nums[nums.length];


//        HashMap<Integer,Integer> hashMap = new HashMap<>();
//        int ans = 0;
//        for (int i=0; i<nums.length; i++){
//            int pair = nums[i];
//            if (hashMap.containsKey(pair))
//                hashMap.remove(pair);
//            else
//                hashMap.put(nums[i], i);
//        }
//
//        for (int j : hashMap.keySet()){
//             ans = j;
//        }
//        return ans;
    }
}