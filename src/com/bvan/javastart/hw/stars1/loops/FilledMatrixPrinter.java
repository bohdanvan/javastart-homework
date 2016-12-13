package com.bvan.javastart.hw.stars1.loops;

import com.bvan.common.Args;

/**
 * @author bvanchuhov
 */
public class FilledMatrixPrinter {

    public static void main(String[] args) {
        System.out.println("printFilledMatrix(2, 3, -1):");
        printFilledMatrix(2, 3, -1);
        System.out.println("-------------------");

        System.out.println("printFilledMatrix(0, 10, -1):");
        printFilledMatrix(0, 10, -1);
        System.out.println("-------------------");

//        System.out.println("printFilledMatrix(-3, 10, -1):");
//        printFilledMatrix(-3, 10, -1); // IllegalArgumentException
    }

    public static void printFilledMatrix(int rows, int cols, int filler) {
        Args.checkRows(rows);
        Args.checkCols(cols);

        for (int i = 0; i < rows; i++) {
            printRow(cols, filler);
        }
    }

    private static void printRow(int size, int filler) {
        for (int i = 0; i < size; i++) {
            System.out.print(filler + " ");
        }
        System.out.println();
    }
}
