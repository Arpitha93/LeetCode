package com.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class MaeetingRoom2 {

    public int meetingRoom2(int[][] intervals) {
        if (intervals.length == 0 || intervals == null)
            return 0;

        Comparator<int[]> start = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[0] - b[0];
            }
        };

        Comparator<int[]> end = new Comparator<int[]>() {
            @Override
            public int compare(int[] a, int[] b) {
                return a[1] - b[1];
            }
        };

        Arrays.sort(intervals, start);
        PriorityQueue<int[]> minHeap = new PriorityQueue<int[]>(end);
        minHeap.add(intervals[0]);
        for (int i = 1; i < intervals.length; i++) {
            int[] earliest = minHeap.poll();
            if (earliest[1] <= intervals[i][0]) {
                earliest[1] = intervals[i][1];
            }
            else {
                minHeap.add(intervals[i]);
            }
            minHeap.add(earliest);
        }
        return minHeap.size();

    }

}