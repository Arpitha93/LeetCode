package com.medium;

import java.util.*;

public class TopkFrequentWords {
    public List<String> topFrequent(List<String> words, int k) {
        List<String> frequency = new ArrayList<>();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (String word: words) {
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }

        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                int frequency1 = hashMap.get(s1);
                int frequency2 = hashMap.get(s2);
                if (frequency1 == frequency2)
                    return s2.compareTo(s1);
                return frequency2 - frequency1;
            }
        });

        for (Map.Entry<String,Integer> entry : hashMap.entrySet() ) {
            pq.add(entry.getKey());
            if (pq.size() > k)
                pq.poll();
        }

        while (!pq.isEmpty())
            frequency.add(pq.poll());

        Collections.reverse(frequency);

        return frequency;
    }

}