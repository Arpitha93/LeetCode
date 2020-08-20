package com.medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class WordBreak {
    HashMap<String, Boolean> wordMap = new HashMap<>();
    public boolean wordBreak(String s, List<String> wordDict) {
        HashSet<String> hashSet = new HashSet<>(wordDict);
        return wordBreak(s, hashSet);
    }

    public boolean wordBreak(String s, HashSet<String> word_dict) {
        if (wordMap.containsKey(s)) {
           return wordMap.get(s);
        }

        if (s.length() == 0)
            return true;

        for (int i = 0; i < s.length(); i++) {
            if (word_dict.contains(s.substring(0, i+1))) {
                if (wordBreak(s.substring(i+1), word_dict)) {
                    wordMap.put(s, true);
                    return true;
                }
            }
        }
        wordMap.put(s, false);
        return false;
    }
}