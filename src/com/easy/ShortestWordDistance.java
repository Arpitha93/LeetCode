package com.easy;

import java.util.ArrayList;
import java.util.List;

public class ShortestWordDistance {
    public int shortwordDist(String[] words, String word1, String word2){
        List<Integer> get_word1 = new ArrayList<>();
        List<Integer> get_word2 = new ArrayList<>();
        int min = Integer.MAX_VALUE;

        for (int i=0; i<words.length; i++){
            if (words[i].equals(word1))
                get_word1.add(i);

            else if (words[i].equals(word2))
                get_word2.add(i);
        }

        for (int a: get_word1){
            for (int b:get_word2){
                min = Math.min(min, Math.abs(a-b));
            }
        }

        return min;
    }
}