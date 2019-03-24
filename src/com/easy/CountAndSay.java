package com.easy;

public class CountAndSay {
    public String countAndSay(int n) {
        StringBuilder sb = new StringBuilder();
        String s1 = "1";

//        int temp = Integer.parseInt(s1);
//        if (n <= 1)
//            return s1;

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < temp; j++) {
//                int count = 1;
//               // String s2 = Integer.toString(temp);
//                temp = j;
//                if (j<s1.length()-1 && s1.charAt(j) == s1.charAt(i+1))
//                {
//                    count++;
//                    j++;
//                }
//                else {
//                    sb.append(count);
//                    sb.append(s1.charAt(j));
//                }
//
//            }
//            return sb.toString();
//        }
//        return Integer.toString(temp);
        if(n<=1){
            return s1;
        }

        int count = 1;
        for(int i=0; i<s1.length(); i++){
            if (i<s1.length()-1 && s1.charAt(i) == s1.charAt(i+1)){
                count++;
            }
            else{
                sb.append(count);
                sb.append(s1.charAt(i));
                count = 1;
            }
        }
        return sb.toString();
    }
}