package com.bvan.javastart.hw.stars2;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
public class PascalTriangleCreator {

    public static void main(String[] args) {
        System.out.println("n = 0:");
        int[][] pascalTriangle1 = createPascalTriangle(0);
        MatrixPrinter.printMatrix(pascalTriangle1);
        System.out.println("-------------------");

        System.out.println("n = 3:");
        int[][] pascalTriangle2 = createPascalTriangle(3);
        MatrixPrinter.printMatrix(pascalTriangle2);
        System.out.println("-------------------");

        System.out.println("n = 10:");
        int[][] pascalTriangle3 = createPascalTriangle(10);
        MatrixPrinter.printMatrix(pascalTriangle3);
        System.out.println("-------------------");

//        System.out.println("n = -1:");
//        createPascalTriangle(-1); // IllegalArgumentException
    }

    public static int[][] createPascalTriangle(int n) {
        Args.notNegative(n, "pascal size");

        int[][] triangle = createTriangle(n + 1);
        fillPascalTriangle(triangle);

        return triangle;
    }

    private static int[][] createTriangle(int size) {
        int[][] triangle = new int[size][];

        for (int row = 0; row < size; row++) {
            triangle[row] = new int[row + 1];
        }

        return triangle;
    }

    private static void fillPascalTriangle(int[][] triangle) {
        fillBorders(triangle, 1);

        for (int row = 2; row < triangle.length; row++) {
            for (int col = 1, lastCol = triangle[row].length - 2; col <= lastCol; col++) {
                triangle[row][col] = triangle[row - 1][col - 1] + triangle[row - 1][col];
            }
        }
    }

    /**
     * Fill border elems.<br/>
     * Example, filler = 1.<br/>
     * 1<br/>
     * 1 1<br/>
     * 1 _ 1<br/>
     * 1 _ _ 1<br/>
     * 1 _ _ _ 1<br/>
     */
    private static void fillBorders(int[][] triangle, int filler) {
        for (int row = 0; row < triangle.length; row++) {
            int lastCol = triangle[row].length - 1;

            triangle[row][0] = filler;
            triangle[row][lastCol] = filler;
        }
    }
}
