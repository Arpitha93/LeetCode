package com.easy;

import java.util.Arrays;
import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> intersect = new HashSet<>();
        for (int num : nums1) {
            intersect.add(num);
        }
        int index = 0;
        for (int i = 0; i < nums2.length; i++) {
            if (intersect.contains(nums2[i])) {
                nums1[index++] = nums2[i];
                intersect.remove(nums2[i]);
            }
        }

        return Arrays.copyOfRange(nums1, 0, index);
    }
}