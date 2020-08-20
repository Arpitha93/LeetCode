package com.easy;

import java.util.PriorityQueue;
import java.util.TreeMap;

public class HighFive {
    public int[][] highFive(int[][] items) {
        TreeMap<Integer, PriorityQueue<Integer>> treeMap = new TreeMap<>();
        for (int[] item : items) {
            int id = item[0];
            int score = item[1];
            if (treeMap.containsKey(id)) {
                PriorityQueue<Integer> heap = treeMap.get(id);
                heap.offer(score);
                if (heap.size() >= 5) {
                    heap.poll();
                }
            } else {
                PriorityQueue<Integer> newHeap = new PriorityQueue<>();
                newHeap.offer(score);
                treeMap.put(id, newHeap);
            }
        }

        int[][] avgScore = new int[treeMap.size()][2];
        for (int id : treeMap.keySet()) {
            int sum  = 0;
            PriorityQueue<Integer> heap = treeMap.get(id);
            while (!heap.isEmpty()) {
                sum += heap.poll();
            }
            avgScore[id - 1][0] = id;
            avgScore[id - 1][1] = sum/5;
        }
        return avgScore;
    }
}