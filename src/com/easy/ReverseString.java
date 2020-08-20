package com.easy;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
//        int end = s.length -1;
//        while (start<end){
//            s[start] ^= s[end];
//            s[end] ^= s[start];
//            s[start] ^= s[end];
//
//            start++;
//            end--;
//        }

        for (int i = 0; i < s.length / 2; i++) {
            char temp = s[i];
            s[i] = s[s.length - i - 1];
            s[s.length - i - 1] = temp;
        }
    }
}
