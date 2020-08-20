package com.easy;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {

        if (s.length() == 0 || s.length() == 1)
            return true;

        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        char[] c = s.toCharArray();

        for (int i = 0; i<c.length; i++)
        {
            if (c[i] == c[c.length-1 - i])
                continue;
            else
                return false;
        }
        return true;

    }
}