package com.easy;

public class RemoveDuplicates {
    public int removeDuplicates(int[] nums) {
//         int n=0;
//         if(n==0 || n==1)
//             return n;

//          int temp=0;
//         for(int i=0; i<n-1; i++){
//             if(nums[i] != nums[i+1]){
//                  nums[temp++] = nums[i];
//             }
//               nums[temp++] = nums[n-1];
//         }

//         return temp;


//         int[] temp = new int[n];
//         int j=0;
//         int i=0;

//         for(i=0; i<n-1; i++)
//             if(nums[i] != nums[i+1])
//                 temp[j++] = nums[i];

//         temp[j++] = nums[i-1];

//         for(int k=0; i<j; i++)
//             nums[i] = temp[i];

//         return j;

        int temp=0;
        for(int i=0; i<nums.length; i++){
            if(i==0|| nums[i] != nums[i-1]){
                nums[temp] = nums[i];

                temp++;

            }
        }

        return temp;


    }
}