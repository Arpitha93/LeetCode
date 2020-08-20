package com.easy;

public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
//        if(n == 0)
//            return false;
//
//        while(n>1){
//            if(n == Math.pow(2,n))
//                return true;
//        }
//        return  false;

        while(n!=1){
            if(n % 2 != 0)
                return false;
            n /= 2;
        }
        return true;

    }
}