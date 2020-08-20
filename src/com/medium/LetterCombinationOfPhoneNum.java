package com.medium;

import java.util.ArrayList;
import java.util.List;

public class LetterCombinationOfPhoneNum {
    private List<String> combination = new ArrayList<>();
    private char[][] letterMap = new char[][] {{}, {},
            {'a', 'b', 'c'},
            { 'd', 'e', 'f'},
            { 'g', 'h', 'i'},
            { 'j', 'k', 'l'},
            { 'm', 'n', 'o'},
            { 'p', 'q', 'r', 's'},
            { 't', 'u', 'v'},
            { 'w', 'x', 'y', 'z'}};

    public List<String> letterCombination(String digits) {
        getCombination(digits.toCharArray(), 0, new StringBuilder(""));
        return combination;
    }

    private void getCombination(char[] digits, int index, StringBuilder word) {
        if (index == digits.length) {
            if (word.length() > 0)
                return;
        }

        int number = Character.getNumericValue(digits[index]);
        if (letterMap[number].length == 0) {
            getCombination(digits, index+1, word);
        } else {
            for (char c : letterMap[number]) {
                word.append(c);
                getCombination(digits, index+1, word);
                word.setLength(word.length() - 1);
            }
        }
    }
}