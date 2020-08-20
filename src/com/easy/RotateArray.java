package com.easy;

public class RotateArray {
        public void rotate(int[] nums, int k) {
//         int i, temp=0;
//         int length = nums.length;
//         for (i = 0; i < k; i++) {
//            temp = nums[length - 1];

//         for(int j = length - 1; j>0; j--){
//                     nums[j] = nums[j-1];
//         }
//         nums[0] = temp;
//     }
            int n = nums.length;
            k%=n;
            reverseArray(nums, 0, n-1);
            reverseArray(nums, 0, k-1);
            reverseArray(nums, k, n-1);


        }

        void reverseArray(int arr[], int start, int end){
            int temp = 0;
            while (start < end)
            {
                temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
}