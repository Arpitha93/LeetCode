package com.easy;

public class ReverseInteger {

        public int reverse(int x) {
            String check= "";
            StringBuilder sb = new StringBuilder(check);
            sb.append(x);
            if(sb.length() <= 1){
                return x;
            }
            String ans="";
            int negCheck = 0;
            if(x<0){
                negCheck=1;
                x*=(-1);
            }
            while(x !=0){
                int remainder = x%10;
                if(remainder != 0){
                    ans=ans+remainder;
                }

                x=x/10;
            }
            System.out.println(ans);
            //return 0;

            if(negCheck == 1){
                return (-1)*Integer.parseInt(ans);
            }

            return Integer.parseInt(""+ans);
        }
    }


class Solution {
    public int reverse(int x) {
    long ans = 0;

        while(x!=0){
            ans = ans * 10;
            int remainder = x%10;
            if(remainder != 0){
                ans = ans + remainder;
                }
            x = x/10;
        }

        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
        return 0;
        }

        return (int)ans;

    }
}
