package com.easy;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
//         int low = 0, high = nums.length-1;


//         while(low <= high){
//             int mid = (high - low)/2;

//             if(nums[mid] == target)
//                 return mid;
//             else if(nums[mid] < target)
//               low = mid - 1;
//             else
//             high = mid + 1;

//         }
//         return low;

        for(int i=0; i<nums.length; i++){
            if(nums[i] >= target)
                return i;

        }
        return nums.length;
    }
}