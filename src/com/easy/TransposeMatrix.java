package com.easy;

public class TransposeMatrix {
    public int[][] transposeMatrix(int[][] A) {
        int rows = A.length;
        int cols = A[0].length;
        int[][] transposeMatrix = new int[rows][cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                transposeMatrix[row][col] = A[row][col];
            }
        }
        return transposeMatrix;
    }
}