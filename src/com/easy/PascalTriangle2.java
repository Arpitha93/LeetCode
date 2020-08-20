package com.easy;

import java.util.Arrays;
import java.util.List;

public class PascalTriangle2 {
    public List<Integer> getRow(int rowIndex) {

        Integer[] sum = new Integer[rowIndex + 1];
        Arrays.fill(sum, 1);

        for (int i = 1; i<rowIndex; i++)
            for (int j = i; j>0; j--)
                sum[j] = sum[j] - sum[j-1];


        return Arrays.asList(sum);

    }
}