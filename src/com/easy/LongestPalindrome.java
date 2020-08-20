package com.easy;

public class LongestPalindrome {
    public int longestPalindrome(String s){
        int[] char_count = new int[128];
        for (char c : s.toCharArray()){
            char_count[c]++;
        }

        int result =0;
        for (int count : char_count){
            result += count / 2 * 2;
            if(result % 2 == 0 && count % 2 == 1){
                result+=1;
            }
        }
        return result;
    }
}
