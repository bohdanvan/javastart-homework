package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 * @see com.bvan.common.Printer
 */
public class MatrixPrinter {

    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] matrix) {
        if (matrix == null) {
            System.out.println("null");
            return;
        }

        for (int[] row : matrix) {
            printArray(row);
        }
    }

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        for (int elem : array) {
            System.out.print(elem + "\t");
        }
        System.out.println();
    }
}
