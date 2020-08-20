package com.medium;

import java.util.ArrayList;

public class IntervalListIntersection {
    public int[][] intervalIntersect(int[][] A, int[][] B) {
        ArrayList<int[]> interval = new ArrayList<>();
        int i = 0, j = 0;

        while (i < A.length && j < B.length) {
            if (overlap(A[i],B[j]) != null) {
                interval.add(overlap(A[i], B[j]));
            }
            if (A[i][1] < B[j][1]) {
                i++;
            } else
                j++;
        }

        int[][] intersection = new int[interval.size()][2];
        for (int k = 0; k < intersection.length; k++){
            intersection[k] = interval.get(k);
        }

        return intersection;
    }

    private int[] overlap(int[] a, int[] b) {
        int front = Math.max(a[0], b[0]);
        int back = Math.min(a[1], b[1]);

        return back <= front ? new int[] {front, back} : null;
    }


}