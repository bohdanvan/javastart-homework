package com.bvan.javastart.hw.stars2;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
public class RhombusPrinter {

    public static void main(String[] args) {
        System.out.println("size = 5:");
        printRhombus(5);
        System.out.println("-------------------");

        System.out.println("size = 15:");
        printRhombus(15);
        System.out.println("-------------------");

        System.out.println("size = 1:");
        printRhombus(1);
        System.out.println("-------------------");
    }

    public static void printRhombus(int size) {
        Args.checkSize(size);
        if (size % 2 == 0) {
            throw new IllegalArgumentException("rhombus size should be odd: " + size);
        }

        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                String filler = isFilledRhombusCell(row, col, size) ? "*" : ".";
                System.out.print(filler);
            }
            System.out.println();
        }
    }

    private static boolean isFilledRhombusCell(int row, int col, int size) {
        int halfSize = size / 2;
        if (row <= halfSize && col <= halfSize) {
            return col == halfSize - row;
        }
        if (row <= halfSize && col > halfSize) {
            return col == halfSize + row;
        }
        if (row > halfSize && col <= halfSize) {
            return col == row - halfSize;
        }
        if (row > halfSize && col > halfSize) {
            return col == 3 * halfSize - row;
        }
        return true; // never happen
    }
}
