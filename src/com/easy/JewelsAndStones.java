package com.easy;

import java.util.HashSet;

public class JewelsAndStones {
    public int  numJewelsInStones(String J, String S){
        HashSet<Character> jewels = new HashSet<Character>();
        for (char c : J.toCharArray()){
            jewels.add(c);
        }

        int numJewels = 0;
        for(char c : S.toCharArray()){
            if(jewels.contains(c))
                numJewels++;
        }
        return  numJewels;
    }
}