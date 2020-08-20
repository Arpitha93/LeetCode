package com.easy;

public class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        if(numbers == null || numbers.length <=1)
            return null;

        int low = 0;
        int high =  numbers.length -1;

        while(low < high && numbers[low] + numbers[high] != target ){
            if(numbers[low] + numbers[high] < target)
                low++;
            else
                high--;
        }
        return new int[] {low+1, high+1};

    }
}