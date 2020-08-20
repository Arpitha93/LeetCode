package com.easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public boolean containsDuplicate(int[] nums, int size) {
//        int[] count = new int[size];
//        for(int i = 0; i<nums.length; i++){
//            if(count[nums[i]] == 1){
//                return true;
//            }
//            else
//                count[nums[i]] = 1;
//        }
//        return false;

        Set<Integer> temp = new HashSet<>();
        for(int i = 0; i <  nums.length; i++){
            temp.add(nums[i]);
        }
        return temp.size() == nums.length? false : true;

    }
}