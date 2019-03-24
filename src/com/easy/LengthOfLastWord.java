package com.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        int len = 0;
        s = s.trim();
        String check = " ";
        if(check == "")
            return 0;

        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == ' ')
                len = 0;
            else
                len++;

        }
        return len;


    }
}