package com.medium;

public class BasicCalculator2 {
    public int basicCalucator(String s) {
        int calculator = 0;
        int tail = 0;
        char[] ch = s.toCharArray();
        char operator = '+';
        int num = 0;
        int n = ch.length;

        for (int i = 0; i < n; i++) {
            char c = ch[i];

            if (c == ' ')
                continue;
            if (Character.isDigit(c)) {
                num = (int) (c - '0');
                while (i + 1 < n && Character.isDigit(ch[i+1])) {
                    num = num * 10 + (int) (ch[i+1] - '0');
                    i++;
                }

                switch (operator) {
                    case '+' :
                        calculator += tail;
                        tail = num;
                         break;

                    case '-' :
                        calculator += tail;
                        tail = -num;
                        break;

                    case '*' :
                        calculator *= tail;
                        break;

                    case '/' :
                        calculator /= tail;
                        break;
                }
            }
            else {
                operator = c;
            }
        }

        return calculator + tail;
    }
}