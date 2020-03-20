package com.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;

public class MergeIntervals {
    int[][] merge = null;
    public int[][] merge(int[][] intervals) {
        if (intervals.length == 0)
            return new int[][] {};
        Stack<int[]> stack = new Stack<>();
        Interval comp = new Interval();
        Arrays.sort(intervals, comp);
        stack.push(intervals[0]);

        for (int i = 1; i < intervals.length; i++) {
            if(overlap(stack.peek(), intervals[i])) {
                int[] temp = stack.pop();
                temp[1] = Math.max(temp[1], intervals[i][1]);
                stack.push(temp);
            } else {
                stack.push(intervals[i]);
            }
        }

        merge = new int[stack.size()][2];
        for (int i = merge.length - 1; i >= 0; i--) {
            merge[i] = stack.pop();
        }

        return merge;

    }

    public boolean overlap(int[] a, int[] b) {
        int front = Math.max(a[0], b[0]);
        int back = Math.min(a[1], b[1]);
        return back - front >= 0 ? true : false;
    }

    class Interval implements Comparator<int[]> {
        public int compare(int[] one, int[] two) {
            return one[0] - two[0];
        }
    }
}