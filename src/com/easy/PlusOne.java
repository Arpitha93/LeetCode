package com.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
       // int carry = digits.get(n - 1) / 10;
       // int carry = (digits.length -1) / 10;
        int i = 0;
//        if(digits[i] == 0)
//            return 0;
        // for(int i=0; i<n-2; i++)
        for( i=n-1; i>=0; i--){
            if (digits[i]<9){
                digits[i]++;
                return digits;

                // else
                //     digits[i] = 0;
            }
            //return digits;
            digits[i] = 0;
//            if (carry == 1){
//                digits[i]++;
//            }

        }
        int[] carry = new int [n+1];
        carry[0] = 1;

        return carry;
      //  return digits;

//        if (carry == 1){
//            digits[i]++;
//        }
    }
}