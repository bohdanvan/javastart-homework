package com.bvan.javastart.hw.stars2;

import com.bvan.common.Args;
import com.bvan.common.Printer;

/**
 * @author bvanchuhov
 */
public class SpiralCreator {

    private static final int LEFT = 0;
    private static final int RIGHT = 1;
    private static final int UP = 2;
    private static final int DOWN = 3;

    private static final int NO_VALUE = 0;

    public static void main(String[] args) {
        System.out.println("rows = 3, cols = 3:");
        int[][] spiral1 = createSpiral(3, 3);
        Printer.printMatrix(spiral1);
        System.out.println("-------------------");

        System.out.println("rows = 2, cols = 4:");
        int[][] spiral2 = createSpiral(2, 4);
        Printer.printMatrix(spiral2);
        System.out.println("-------------------");

        System.out.println("rows = 10, cols = 20:");
        int[][] spiral3 = createSpiral(10, 20);
        Printer.printMatrix(spiral3);
        System.out.println("-------------------");

//        System.out.println("size = 1:");
//        createSpiral(-1, 1); // IllegalArgumentException
    }

    public static int[][] createSpiral(int rows, int cols) {
        Args.checkRows(rows);
        Args.checkCols(cols);

        int[][] spiral = new int[rows][cols];

        int direction = RIGHT;

        int row = 0;
        int col = 0;
        for (int count = 1, maxCount = rows * cols; count <= maxCount; count++) {
            spiral[row][col] = count;

            direction = changeDirection(direction, spiral, row, col);
            row = changeRow(row, direction);
            col = changeCol(col, direction);
        }

        return spiral;
    }

    private static int changeDirection(int currentDirection, int[][] spiral, int row, int col) {
        int rows = spiral.length;
        int cols = spiral[0].length;

        switch (currentDirection) {
            case LEFT:
                return (col > 0 && spiral[row][col - 1] == NO_VALUE) ? LEFT : UP;
            case RIGHT:
                return (col < cols - 1 && spiral[row][col + 1] == NO_VALUE) ? RIGHT : DOWN;
            case UP:
                return (row > 0 && spiral[row - 1][col] == NO_VALUE) ? UP : RIGHT;
            case DOWN:
                return (row < rows - 1 && spiral[row + 1][col] == NO_VALUE) ? DOWN : LEFT;
            default:
                throw new IllegalArgumentException("incorrect direction: " + currentDirection);
        }
    }

    private static int changeCol(int currentCol, int direction) {
        switch (direction) {
            case LEFT:
                return currentCol - 1;
            case RIGHT:
                return currentCol + 1;
            default:
                return currentCol;
        }
    }

    private static int changeRow(int currentRow, int direction) {
        switch (direction) {
            case UP:
                return currentRow - 1;
            case DOWN:
                return currentRow + 1;
            default:
                return currentRow;
        }
    }
}
