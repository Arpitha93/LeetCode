package com.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindFirstUniqueCharacter {
    public List<String> findUnique(String A) {
        List<String> commonChar = new ArrayList<>();
        int[] frequency = new int[26];
        Arrays.fill(frequency, Integer.MAX_VALUE);

        for (String current_string : A) {
            int[] char_frequency = new int[26];
            for (char c : current_string.toCharArray()) {
                char_frequency[c - 'a']++;
            }
            for (int i = 0; i < frequency.length; i++) {
                frequency[i] = Math.min(frequency[i], char_frequency[i]);
            }
        }
        for (int i = 0; i < frequency.length; i++) {
            while (frequency[i] == 1) {
                commonChar.add("" + (char)(i + 'a'));
                frequency[i]--;
            }
        }
        return commonChar;
    }
}