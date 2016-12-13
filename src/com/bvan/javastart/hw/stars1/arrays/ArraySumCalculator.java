package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class ArraySumCalculator {

    public static void main(String[] args) {
        System.out.println("sum(new int[]{2, 1, 3}) = " + sum(new int[]{2, 1, 3})); // 6
        System.out.println("sum(new int[]{}) = " + sum(new int[]{})); // 0
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int elem : array) {
            sum += elem;
        }
        return sum;
    }
}
