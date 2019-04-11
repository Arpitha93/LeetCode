package com.easy;

public class Implement_strStr {

        public int strStr(String haystack, String needle) {
            int count = 0;

            if (needle.length() == 0)
                return 0;


            for (int i = 0; i < haystack.length() - needle.length() +1; i++) {
                for (count = 1; count < needle.length(); count++) {
                    if (haystack.charAt(i + count) != needle.charAt(count))
                        break;
                }


                if (count == needle.length())
                    return i;
            }
            return  -1;
        }


}