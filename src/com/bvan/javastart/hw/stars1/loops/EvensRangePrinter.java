package com.bvan.javastart.hw.stars1.loops;

/**
 * @author bvanchuhov
 */
public class EvensRangePrinter {

    public static void main(String[] args) {
        System.out.print("printEvensRange(0, 9): ");
        printEvensRange(0, 9); // 0 2 4 6 8

        System.out.print("printEvensRange(1, 9): ");
        printEvensRange(1, 9); // 2 4 6 8

        System.out.print("printEvensRange(9, 1): ");
        printEvensRange(9, 1); // <nothing>
    }

    public static void printEvensRange(int first, int last) {
        if (first % 2 != 0) {
            first++;
        }
        for (int n = first; n <= last; n += 2) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}
