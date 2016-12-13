package com.bvan.javastart.hw.stars1.loops;

/**
 * @author bvanchuhov
 */
public class RangePrinter {

    public static void main(String[] args) {
        System.out.print("printRange(1, 5): ");
        printRange(1, 5); // 1 2 3 4 5

        System.out.print("printRange(5, 1): ");
        printRange(5, 1); // 5 4 3 2 1

        System.out.print("printRange(1, 1): ");
        printRange(1, 1); // 1
    }

    public static void printRange(int first, int last) {
        if (first < last) {
            printAscendingRange(first, last);
        } else {
            printDescendingRange(first, last);
        }
    }

    private static void printAscendingRange(int first, int last) {
        for (int i = first; i <= last; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDescendingRange(int first, int last) {
        for (int i = first; i >= last; i--) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
