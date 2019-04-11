/*Given two binary strings, return their sum (also a binary string).

        The input strings are both non-empty and contains only characters 1 or 0.

        Example 1:

        Input: a = "11", b = "1"
        Output: "100"
*/
package com.easy;

public class AddBinary {
        public String addBinary(String a, String b) {

            int i = a.length()-1;
            int j = b.length()-1;
            int sum = 0;
            String carry = "";

            while(i>=0 || j>=0 || sum == 1){
                sum += ((i >= 0)? a.charAt(i) - '0': 0);
                sum += ((j >= 0)? b.charAt(j) - '0': 0);
                carry = (char)(sum % 2 + '0') + carry;
                sum/=2;
                i--;
                j--;

            }
//         int[] carry = new int [n+1];
//         carry[0] = 1;

            return carry;

        }
    }
