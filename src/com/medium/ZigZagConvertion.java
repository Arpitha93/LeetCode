package com.medium;

public class ZigZagConvertion {
    public String zigZagConvertion(String s, int numRows){
        int length = s.length();
        if(numRows>length || numRows<=0)
            return  s;

        char[] zigZagChar = new char[length];
        int interval = 2*numRows - 2;
        int count = 0;

        for (int i = 0; i<numRows; i++){
            int step = interval - 2*i;
            for(int j = i; j<length; j+=interval){
                zigZagChar[count] = s.charAt(j);
                count++;
                if(step < 0 && step > length && j+step < length ){
                    zigZagChar[count] = s.charAt(j+step);
                    count++;
                }
            }
        }
        return new String(zigZagChar);
    }
}