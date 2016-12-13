package com.bvan.javastart.hw.stars1.conditions;

/**
 * @author bvanchuhov
 */
public class MinMaxCalculator {

    public static void main(String[] args) {
        System.out.println("min(20, 10): " + min(20, 10)); // 10
        System.out.println("min(10, 20) = " + min(10, 20)); // 10
        System.out.println("min(20, 20) = " + min(20, 20)); // 20
        System.out.println();

        System.out.println("max(20, 10) = " + max(20, 10)); // 20
        System.out.println("max(10, 20) = " + max(10, 20)); // 20
        System.out.println("max(20, 20) = " + max(20, 20)); // 20
        System.out.println();
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }
}
