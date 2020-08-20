package com.easy;

import java.util.Stack;

public class BackSpaceStringCompare {
    public boolean backspace(String S, String T) {
        return help(S).equals(help(T));
    }

    private String help(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (Character.isLetter(c))
                stack.push(c);
            else if (c == '#' && !stack.isEmpty())
                stack.pop();
        }
        return String.valueOf(s);
    }
}