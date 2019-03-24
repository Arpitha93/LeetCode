package com.easy;

public class Palindrome {
    public boolean palindrome(int x)
    {
        int actualNum=0, reverseNum = 0, remainder =0;
        if(x<0){
            return  false;
        }
        while(x!=0){
            remainder = x%10;
            reverseNum = reverseNum * 10 + remainder;
            x /= 10;
        }
        if(actualNum == reverseNum)
            return  true;
        else
            return  false;
    }
}