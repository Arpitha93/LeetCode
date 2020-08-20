package com.medium;

public class MinRemoveToMakeValidParetheses {
    public String minReamove(String s) {
        StringBuilder sb = new StringBuilder();
        int open = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0)
                    continue;
                open--;
            }
            sb.append(c);
        }

        StringBuilder validParentheses = new StringBuilder();
        for (int i = sb.length() - 1; i >= 0; i--) {
            if (sb.charAt(i) == '(' && open-- > 0){
                continue;
            }
            validParentheses.append(sb.charAt(i));
        }
        return validParentheses.reverse().toString();
    }
}