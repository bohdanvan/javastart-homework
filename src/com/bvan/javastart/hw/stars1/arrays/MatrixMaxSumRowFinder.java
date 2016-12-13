package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class MatrixMaxSumRowFinder {

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        };
        System.out.println("maxSumRowIndex(matrix) = " + maxSumRowIndex(matrix)); // 1
    }

    public static int maxSumRowIndex(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("empty matrix");
        }

        int maxSumRowIndex = 0;
        int maxRowSum = sum(matrix[maxSumRowIndex]);
        for (int i = 1; i < matrix.length; i++) {
            int rowSum = sum(matrix[i]);
            if (maxRowSum < rowSum) {
                maxRowSum = rowSum;
                maxSumRowIndex = i;
            }
        }
        return maxSumRowIndex;
    }

    private static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
