package com.easy;

//public class StringCompression {
//    public int stringCompreesion(char[] chars) {
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        int count = 1;
//        Character prev = null;
//        for (int i=0; i<chars.length; i++) {
//            char ch = chars[i];
//            if (prev == null) {
//                hashMap.put(chars[i], count);
//            } else if (prev.equals(chars[i])) {
//                hashMap.get(chars[i]);
//                count++;
//            } else {
//                if (count > 1) {
//                    String cntSt = String.valueOf(count);
//                    for (char cntCh : cntSt.toCharArray()) {
//                        hashMap.getOrDefault(chars[i], count);
//                    }
//                }
//                count = 1;
//                hashMap.put(chars[i], count);
//            }
//            prev = ch;
//            if (count > 1) {
//                String cntSt = String.valueOf(count);
//                for (char cntCh : cntSt.toCharArray()) {
//                    hashMap.getOrDefault(chars[i], count);
//                }
//            }
//        }
//        return count;
//        int compress = 0;
//        int count = 1;
//        Character prev = null;
//        for (int i=0; i<chars.length; i++) {
//            char ch = chars[i];
//            if (prev == null) {
//                chars[compress++] = ch;
//            } else if (prev.equals(ch)) {
//                count++;
//            } else {
//                if (count > 1) {
//                    String cntSt = String.valueOf(count);
//                    for (char cntCh : cntSt.toCharArray()) {
//                        chars[compress++] = cntCh;
//                    }
//                }
//                count = 1;
//                chars[compress++] = ch;
//            }
//            prev = ch;
//        }
//        if (count > 1) {
//            String cntSt = String.valueOf(count);
//            for (char cntCh : cntSt.toCharArray()) {
//                chars[compress++] = cntCh;
//            }
//        }
//        return compress;
//    }
//}

import java.util.ArrayList;
import java.util.List;

public class StringCompression {
    public List<Character> stringCompression(char[] chars) {
        List<Character> compressedStr = new ArrayList<>();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == chars[i+1]) {
                count++;
            }
            else
                compressedStr.add(chars[i]);
                if (count > 1) {
                    String countStr = String.valueOf(count);
                    while (true) {

                    }
                    for (char c : countStr.toCharArray()) {
                        chars[] = countStr;
                    }
                }
            count = 1;
        }
    return compressedStr;
    }
}