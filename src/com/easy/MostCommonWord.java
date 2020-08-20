package com.easy;

import java.util.HashMap;
import java.util.HashSet;

public class MostCommonWord {
    public String mostCOmmonWord(String paragraph, String[] banned) {
        HashSet<String> banned_words = new HashSet<>();
        for (String word : banned) {
            banned_words.add(word);
        }

        HashMap<String, Integer> paragragh_count = new HashMap<>();
        for (String word : paragraph.replaceAll("[^a-zA-z]", " ").toLowerCase().split(" ")) {
            if (!banned_words.contains(banned)) {
                paragragh_count.put(word, paragragh_count.getOrDefault(word, 0) + 1 );
            }
        }

        String commonWord = "";
        for (String key : paragragh_count.keySet()) {
            if (commonWord.equals("") || paragragh_count.get(key) > paragragh_count.get(commonWord)) {
                commonWord = key;
            }
        }

        return commonWord;
    }
}