package com.bvan.javastart.hw.stars1.arrays;

import com.bvan.common.Printer;

/**
 * @author bvanchuhov
 */
public class MatrixTransposer {

    public static void main(String[] args) {
        int[][] srcMatrix = new int[][] {
                {1, 2, 3, 4},
                {5, 6, 7, 8}
        };
        int[][] transposedMatrix = transpose(srcMatrix);
        Printer.printMatrix(transposedMatrix);
    }

    public static int[][] transpose(int[][] matrix) {
        if (matrix.length == 0) {
            throw new IllegalArgumentException("empty array");
        }

        int rows = matrix.length;
        int cols = matrix[0].length;
        int[][] resMatrix = new int[cols][rows];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                resMatrix[col][row] = matrix[row][col];
            }
        }
        return resMatrix;
    }
}
