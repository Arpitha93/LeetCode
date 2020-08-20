package com.easy;

public class AddStrings {
    public String addString(String num1, String num2) {
        int i1 = num1.length() - 1;
        int i2 = num2.length() - 1;
        StringBuffer sb = new StringBuffer();
        int carry = 0;

        while (i1 >= 0 || i2 >= 0) {
            int n1 = i1 >= 0 ? num1.charAt(i1) - '0' : 0;
            int n2 = i2 >= 0 ? num2.charAt(i2) - '0' : 0;
            int sum = n1 + n2 + carry;
            sb.append(sum % 10);
            carry = sum/10;
            i1--;
            i2--;
        }
        if (carry > 0)
            sb.append(carry % 10);

        return sb.reverse().toString();
    }
}