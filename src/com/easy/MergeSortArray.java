package com.easy;

import java.util.Arrays;

public class MergeSortArray {

        public void merge(int[] nums1, int m, int[] nums2, int n) {
//         nums1 = m.length;
//         nums2 = n.length;

            // System.arraycopy(nums2, 0, nums1 , m, nums2.length);
            // Arrays.sort(nums1);

            for(int i=0; i<n; i++){
                nums1[m+i] = nums2[i];
            }
            Arrays. sort(nums1);

        }

}