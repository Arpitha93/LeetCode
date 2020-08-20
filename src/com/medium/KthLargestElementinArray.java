package com.medium;

import java.util.PriorityQueue;

public class KthLargestElementinArray {
    public int largestArray(int[] nums, int K) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>((n1, n2) -> n1 - n2);
        for (int n : nums) {
            priorityQueue.add(n);
            if (priorityQueue.size() > K)
                priorityQueue.poll();
        }

        return priorityQueue.poll();
    }
}