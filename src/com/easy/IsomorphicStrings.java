package com.easy;

import java.util.Arrays;

public class IsomorphicStrings {
    static int size = 256;
    public boolean isIsomorphic(String s, String t) {

        if(s.length() != t.length())
            return false;

        Boolean[] visited = new Boolean[size];
        Arrays.fill(visited, Boolean.FALSE);

        int[] map = new int[size];
        Arrays.fill(map, -1);

        for(int i=0; i<t.length(); i++){
            if(map[s.charAt(i)] == -1){
                if(visited[t.charAt(i)] == true)
                    return  false;

                visited[t.charAt(i)] = true;

                map[s.charAt(i)] = t.charAt(i);
            }
            else if(map[s.charAt(i)] != t.charAt(i))
                return false;

        }

        return true;



    }
}