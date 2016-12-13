package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class IdentityMatrixChecker {

    public static void main(String[] args) throws IllegalAccessException {
        System.out.println(isIdentity(
                new int[][]{
                        {1, 0, 0},
                        {0, 1, 0},
                        {0, 0, 1}
                }
        )); // true

        System.out.println(isIdentity(
                new int[][]{
                        {1, 0, 2},
                        {0, 1, 0},
                        {2, 0, 1}
                }
        )); // false

//        System.out.println(isIdentity(
//                new int[][]{
//                        {1, 0, 0},
//                        {0, 1, 0},
//                        {0, 0, 1},
//                        {0, 0, 0}
//                }
//        )); // IllegalArgumentException
    }

    public static boolean isIdentity(int[][] matrix) {
        checkMatrix(matrix);

        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (!isIdentityMatrixCell(matrix, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean isIdentityMatrixCell(int[][] matrix, int row, int col) {
        if (row == col) {
            if (matrix[row][col] == 1) {
                return true;
            }
        } else {
            if (matrix[row][col] == 0) {
                return true;
            }
        }
        return false;
    }

    private static void checkMatrix(int[][] matrix) {
        int rows = matrix.length;
        if (rows == 0) {
            throw new IllegalArgumentException("empty matrix");
        }

        int cols = matrix[0].length;
        if (rows != cols) {
            throw new IllegalArgumentException("matrix is not square: rows = " + rows + ", cols = " + cols);
        }
    }
}
