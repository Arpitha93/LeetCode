package com.easy;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static int romanToInt(String s) {

//         int value[] = new int [s.length()];
//         for(int i=0; i<s.length(); i++)
//             switch (s.charAt(i))
//             {
//                 case 'I' : value[i] = 1;
//                     break;
//                 case 'V' : value[i] = 5;
//                     break;
//                 case 'X' : value[i] = 10;
//                     break;
//                 case 'L' : value[i] = 50;
//                     break;
//                 case 'C' : value[i] = 100;
//                     break;
//                 case 'D' : value[i] = 500;
//                     break;
//                 case 'M' : value[i] = 1000;
//                     break;

//             }
        //   int res = 0;
//         for(int i=0; i<value.length-1; i++){
//             if(value[i]<value[i+1])
//                 res-=value[i];
//                 else
//                 res+=value[i];
//         }
//         return res+value[value.lenght-1];



        int length = s.length();
        Map<Character, Integer> value = new HashMap<>();
        value.put('I', 1);
        value.put('V', 5);
        value.put('X', 10);
        value.put('L', 50);
        value.put('C', 100);
        value.put('D', 500);
        value.put('M', 1000);


        int res = value.get(s.charAt(length-1));
        //int res=0;
        for(int i=0; i<length-1; i++)
        {
            if(value.get(s.charAt(i)) < value.get(s.charAt(i+1)))
                res-=value.get(s.charAt(i));
            else
                res+=value.get(s.charAt(i));
        }
        // return res+value.get(s.charAt(i));
        return res;
        //  throw new NullPointerException("");

    }

    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        String c;
////        System.out.println("enter the roman characters");
//        c = scan.nextLine();
        romanToInt("II");

//       String rm = new String();
//       System.out.println("Integer form of Roman" + rm.romanToInt(c));
        // System.out.println(new romanToInt().convertRomanToDecimal("XCIX"));




    }
}