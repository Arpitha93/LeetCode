package com.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubdomainvisitCount {
    public List<String> subdomainVisitCount(String[] cpdomains){
        HashMap<String, Integer> count = new HashMap<String, Integer>();
        for (String domain : cpdomains){
            int click = Integer.parseInt(domain.substring(0, domain.indexOf(" ")));
            String curr = domain.substring(domain.indexOf(" ") + 1);
            while (!curr.isEmpty()){
                count.put(curr, count.getOrDefault(curr, 0) + click);
                int index = curr.indexOf(".");
                if(index != -1){
                    curr = curr.substring(index + 1);
                } else {
                    curr = "";
                }

            }
        }

        List<String> domain = new ArrayList<>();
        for (String key : count.keySet()){
            int counts = count.get(key);
            String toAdd = counts + " " + key;
            domain.add(toAdd);
        }
        return  domain;

    }
}