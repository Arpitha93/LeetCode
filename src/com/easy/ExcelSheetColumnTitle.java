package com.easy;

public class ExcelSheetColumnTitle {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();

        while(n>0){
            int rem = n % 26;
            if(rem == 0)
                rem += 26;

            if(n >= rem){
                n = n - rem;
                sb.append((char) (rem + 26));
            }
            n /= 26;
        }

        return sb.reverse().toString();

    }
}