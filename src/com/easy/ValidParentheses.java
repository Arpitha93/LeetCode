package com.easy;

import java.util.Stack;

public class ValidParentheses {
    private static boolean isLeftMatch(char exp) {
        switch (exp) {
            case '(':
            case '{':
            case '[':
                return true;
        }
        return false;
    }


    private static char isRightMatch(char exp) {
        switch (exp) {
            case '(':
                return ')';
            case '{':
                return '}';
            case '[':
                return ']';

        }
        return ' ';
    }

    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (isLeftMatch(c)) {
                st.push(c);
                continue;
            }

            if (st.isEmpty() || isRightMatch(st.pop()) != c)
                return false;
        }
        return st.isEmpty();
    }
}