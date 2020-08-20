package com.easy;

import java.util.HashMap;

public class FirstUniqueCharacterInString {
    public int uniqueCharacter(String s) {
        HashMap<Character, Integer> stringMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            stringMap.put(c, stringMap.getOrDefault(c, 0) + 1);

        }

        for (int i = 0; i < s.length(); i++) {
            if (stringMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }
        return -1;
    }
}