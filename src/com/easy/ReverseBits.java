package com.easy;

public class ReverseBits {
    public int reverseBits(int n) {
        int rev = 0;
        if(n==0)
            return 0;

        for(int i =0; i<32; i++){
            rev <<= 1;
            if((n&1) == 1)
                rev ^= 1;
            n>>=1;
        }
        return rev;

    }
}