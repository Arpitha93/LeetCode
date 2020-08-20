package com.medium;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class TimeBasedKeyValueStore {
    // Map<String, TreeMap<Integer, String>> treeMap;
    HashMap<String, List<Pair<Integer, String>>> hashMap;

    /** Initialize your data structure here. */
    public void TimeMap() {
        // treeMap = new HashMap();
        hashMap = new HashMap();

    }

    public void set(String key, String value, int timestamp) {
        if (!hashMap.containsKey(key)) {
            // treeMap.put(key, new TreeMap());
            hashMap.put(key, new ArrayList<Pair<Integer, String>>());
        }

        // treeMap.get(key).put(timestamp, value);
        hashMap.get(key).add(new Pair(timestamp, value));
    }

    public String get(String key, int timestamp) {
        if (!hashMap.containsKey(key))
            return "";

        // TreeMap<Integer, String>tree = treeMap.get(key);
        // Integer t = tree.floorKey(timestamp);
        // return t != null ? tree.get(t) : "";

        List<Pair<Integer, String>> list = hashMap.get(key);
        int i = Collections.binarySearch(list, new Pair<Integer, String>(timestamp, "{"),
                (a, b) -> Integer.compare(a.getKey(), b.getKey()));

        if (i >= 0)
            return list.get(i).getValue();
        else if (i == -1)
            return "";
        else
            return list.get(-i-2).getValue();

    }
}
//class TimeMap {
//    TimeMap obj = new TimeMap();
//    obj.set(key,value,timestamp);
//    String param_2 = obj.get(key,timestamp);
//}
