package com.medium;

import java.util.Stack;

public class DecodeString {
    public String decodeString(String s) {
        Stack<Integer> nums = new Stack<>();
        Stack<String> alpha = new Stack<>();
        int index = 0;
        String decodedString = "";

        while (index < s.length()) {
            if (Character.isDigit(s.charAt(index))) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                nums.push(count);
            } else if (s.charAt(index) == '[') {
                alpha.push(decodedString);
                decodedString = "";
                index++;
            } else if (s.charAt(index) == ']')  {
                StringBuilder temp = new StringBuilder(alpha.pop());
                int count = nums.pop();
                for (int i = 0; i < count; i++) {
                    temp.append(count);
                }
                decodedString = temp.toString();
                index++;
            } else {
                decodedString += s.charAt(index);
                index++;
            }
        }

        return decodedString;
    }
}