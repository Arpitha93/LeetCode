package com.easy;

import java.util.Arrays;

public class TwoCityScheduling {
    public int twoCityScheduling(int[][] costs) {
        int cost = 0;
        Arrays.sort(costs, (a,b) -> (a[0] - a[1]) - (b[0] - b[1]));

        int n = costs.length;
        int half = n/2;
        for (int i = 0; i < n; i++) {
            if (i < half) {
                cost += costs[i][0];
            }
            else {
                cost += costs[i][1];
            }
        }
        return cost;
    }
}