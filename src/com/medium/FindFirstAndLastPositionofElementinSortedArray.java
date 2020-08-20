package com.medium;

public class FindFirstAndLastPositionofElementinSortedArray {
    public int[] searchRange(int[] nums, int target ) {
        int[] range = {-1, -1};
        for (int i = 0; i < nums.length; i++) {
            if (nums[i]== target) {
                range[0] = i;
                break;
            }
        }

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] == target) {
                range[1] = i;
                break;
            }
        }
        return range;
    }
}