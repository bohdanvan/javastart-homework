package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class MatrixAverageCalculator {

    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {0, 3, -2},
                {2, 50, 3},
                {-1, 5, 2}
        };
        System.out.println("avg(matrix) = " + avg(matrix)); // 6
    }

    public static int avg(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("can't find average for empty matrix");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int elems = rows * cols;

        int sum = sum(matrix);
        return sum / elems;
    }

    private static int sum(int[][] matrix) {
        int sum = 0;
        for (int[] row : matrix) {
            for (int elem : row) {
                sum += elem;
            }
        }
        return sum;
    }
}
