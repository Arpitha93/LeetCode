package com.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    public List<List<String>> groupAnagrams(String[] strs){
        List<List<String>> groupAnagram = new ArrayList<>();
        HashMap<String, List<String>> hm = new HashMap<>();

        for(String cur : strs){
            char[] c = cur.toCharArray();
            Arrays.sort(c);
            String sorted = new String(c);
            if(!hm.containsKey(sorted)){
                hm.put(sorted, new ArrayList<>());
            }
            hm.get(sorted).add(cur);

        }

        groupAnagram.addAll(hm.values());
        return  groupAnagram;
    }
}