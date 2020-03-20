package com.medium;

import java.util.Stack;

public class MinAddToMakeParenthesesValid {
    public int minAddToMakeParenthesesValid(String S) {
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i<S.length(); i++) {
            char c = S.charAt(i);
            if (c == '(') {
                stack.push(i);
            } else {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                } else {
                    stack.push(i);
                }
            }
        }
        return stack.size();
    }
}