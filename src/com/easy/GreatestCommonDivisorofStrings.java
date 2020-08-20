package com.easy;

import java.util.HashSet;

public class GreatestCommonDivisorofStrings {
    public String gcdOfString(String str1, String str2) {
        String gcd = "";
        HashSet<Character> strSet = new HashSet<>();
        for (char c : str1.toCharArray()) {
            strSet.add(c);
        }

        for (int i = 0; i < str2.length(); i++) {
            if (strSet.contains(str2.charAt(i))) {
                gcd += str2.charAt(i);
                strSet.remove(str2.charAt(i));
            }
            strSet.remove(str1);
        }
        return gcd;
    }
}