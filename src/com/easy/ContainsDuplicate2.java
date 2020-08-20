package com.easy;

import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate2 {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> hmap = new HashMap<>();

        for (int i=0; i<nums.length; i++){
            if (hmap.containsKey(nums[i])){
                int min = hmap.get(nums[i]);
                hmap.put(nums[i], Math.abs(i - min));
                if (Math.abs(i-min)<k){
                    return true;
                }
            }
            else
                hmap.put(nums[i],i);

        }
        return  false;


    }

}