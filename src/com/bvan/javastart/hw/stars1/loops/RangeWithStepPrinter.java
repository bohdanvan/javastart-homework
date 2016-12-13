package com.bvan.javastart.hw.stars1.loops;

/**
 * @author bvanchuhov
 */
public class RangeWithStepPrinter {

    public static void main(String[] args) {
        System.out.print("printRange(1, 8, 2): ");
        printRange(1, 8, 2); // 1 3 5 7

        System.out.print("printRange(8, 1, -2): ");
        printRange(8, 1, -2); // 8 6 4 2

        System.out.print("printRange(1, 1, 0): ");
        printRange(1, 1, 0); // 1

//        System.out.print("printRange(1, 8, -2): ");
//        printRange(1, 8, -2); // IllegalArgumentException
//
//        System.out.print("printRange(8, 1, 2): ");
//        printRange(8, 1, 2); // IllegalArgumentException
//
//        System.out.print("printRange(8, 1, 0): ");
//        printRange(8, 1, 0); // IllegalArgumentException

    }

    public static void printRange(int first, int last, int step) {
        if (first < last) {
            printAscendingRange(first, last, step);
        } else if (first > last) {
            printDescendingRange(first, last, step);
        } else {
            System.out.println(first);
        }
    }

    private static void printAscendingRange(int first, int last, int step) {
        if (step <= 0) {
            throw new IllegalArgumentException("step for an ascending range should be positive: " +
                    step + " for range (" + first + ", " + last + ")");
        }

        for (int i = first; i <= last; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    private static void printDescendingRange(int first, int last, int step) {
        if (step >= 0) {
            throw new IllegalArgumentException("step for a descending range should be positive: " +
                    step + " for range (" + first + ", " + last + ")");
        }

        for (int i = first; i >= last; i += step) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
