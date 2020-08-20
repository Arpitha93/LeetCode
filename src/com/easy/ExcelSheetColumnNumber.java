package com.easy;

public class ExcelSheetColumnNumber {
    public int titleToNumber(String s) {
        if(s == null || s.length() < 1)
            return 0;
        char[] ch = s.toCharArray();
        int res = 0;
        for(int i=0; i<ch.length; i++){
            res += Math.pow(26, ch.length - i - 1) * (ch[i] - 64 );
        }
        return res;

    }
}