package com.easy;

public class ReverseWordsInaString3 {
    public String reverseWord(String s) {
        char[] ch = s.toCharArray();
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] == ' ') {
                reverse(ch, index, i-1);
            } else if (i == s.length() - 1) {
                reverse(ch, index, i);
            }
        }
        return new String(ch);
    }

    private void reverse(char[] ch, int start, int end) {
        char temp = ch[start];
        ch[start] = ch[end];
        ch[end] = temp;

        start++;
        end--;
    }


}