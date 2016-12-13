package com.bvan.common;

/**
 * @author bvanchuhov
 */
public class Printer {

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
