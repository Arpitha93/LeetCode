package com.easy;

import java.util.HashMap;

public class RansomNote {
    public boolean ransomNote(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length())
            return false;

        HashMap<Character, Integer> magazineCount = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            int count = magazineCount.getOrDefault(c, 0);
            magazineCount.put(c, count + 1);
        }

        for (char c : ransomNote.toCharArray()) {
            int charInmagazine = magazineCount.getOrDefault(c, 0);
            if (charInmagazine == 0)
                return false;
            magazineCount.put(c, charInmagazine - 1);
        }
        return true;
    }
}