package com.easy;

public class VerifyAlienDictionary {
    int[] letter = new int[26];

    public boolean isAlienDictionary(String[] words, String order) {
        for (int i=0; i<order.length(); i++) {
            char c = order.charAt(i);
            letter[c - 'a'] = i;
        }

        for (int i=1; i<words.length; i++) {
            if (!order(words[i-1],words[i]))
                return false;
        }
        return true;
    }

    private boolean order(String word1, String word2) {
        boolean same = true;
        for (int i=0; i<word1.length() && i<word2.length(); i++){
            char word1_char = word1.charAt(i);
            char word2_char = word2.charAt(i);
            if (word1_char == word2_char)
                continue;
            if (word1_char != word2_char)
                same = false;

            if (!same)
                return letter[word1_char - 'a'] < letter[word2_char - 'a'] ? true:false;

        }
        if (word1.length() > word2.length()) {
            return false;
        }

        return true;
    }
}