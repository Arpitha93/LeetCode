package com.easy;

public class NumberOf1Bits {
    public int hammingWeight(int n) {
        int count = 0;
        while(n != 0){
            n = n & (n-1);
            count ++;
            //  if ((n & 1) == 1) {
            //      count++;
            //  }
            // n = n>>>1;
        }
        return count;
    }
}
