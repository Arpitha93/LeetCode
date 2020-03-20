package com.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {
    public List<Integer> spiralMatrix (int[][] matrix) {
        List<Integer> spiral = new ArrayList<>();
        int rowBegin = 0;
        int rowEnd = matrix.length-1;
        int columnBegin = 0;
        int columnEnd = matrix[rowBegin].length-1;

        if (matrix == null || matrix.length == 0) {
            return spiral;
        }

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (int i = columnBegin; i <= columnEnd; i++) {
                spiral.add(matrix[rowBegin][i]);
            }
            rowBegin++;

            for (int i = rowBegin; i <= rowEnd; i++) {
                spiral.add(matrix[i][columnEnd]);
            }
            columnEnd--;

            if (rowBegin <= rowEnd) {
                for (int i = columnEnd; i >= columnBegin; i--) {
                    spiral.add(matrix[rowEnd][i]);
                }
            }
            rowEnd--;

            if (columnBegin <= columnEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    spiral.add(matrix[i][columnBegin]);
                }
            }
            columnBegin++;
        }
        return spiral;
    }
}