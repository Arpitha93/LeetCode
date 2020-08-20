package com.easy;

import java.util.HashMap;

public class BullsandCows {
    public String bullsAndCows(String secret, String guess) {
        HashMap<Character, Integer> frequency = new HashMap<>();
        for (char s : secret.toCharArray()) {
            frequency.put(s, frequency.getOrDefault(s, 0) + 1);
        }
        int bulls = 0, cows = 0;
        for (int i = 0; i < guess.length(); i++) {
            char ch = guess.charAt(i);
            if (frequency.containsKey(ch)) {
                if (ch == secret.charAt(i)) {
                    bulls++;
                    if (frequency.get(ch) <= 0)
                        cows--;
                } else {
                    if (frequency.get(ch) > 0)
                        cows++;
                }
                frequency.put(ch, frequency.get(ch) - 1);
            }
        }
        return Integer.toString(bulls) + "A" + Integer.toString(cows) + "B";
    }
}