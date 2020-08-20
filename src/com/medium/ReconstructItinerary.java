package com.medium;

import java.util.*;

public class ReconstructItinerary {
    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> itinerary = new LinkedList<>();
        Map<String, PriorityQueue<String>> travelMap = new HashMap<>();

        buildGraph(travelMap, tickets);
        dfs(itinerary, travelMap, "JFK");

        return itinerary;
    }

    private void buildGraph(Map<String, PriorityQueue<String>> travelMap, List<List<String>> tickets) {
        for (List<String> travel: tickets) {
            String from = travel.get(0), to = travel.get(1);
            if (!travelMap.containsKey(from)) {
                travelMap.put(from, new PriorityQueue<>());
            }
            travelMap.get(from).offer(to);
        }
    }

    private void dfs(List<String> itinerary, Map<String, PriorityQueue<String>> travelMap,
                     String from) {
        PriorityQueue<String> arrivals = travelMap.get(from);
        while (arrivals != null && !arrivals.isEmpty()) {
            String to = travelMap.get(from).poll();
            dfs(itinerary, travelMap, to);
        }
        itinerary.addFirst(from);
    }
}