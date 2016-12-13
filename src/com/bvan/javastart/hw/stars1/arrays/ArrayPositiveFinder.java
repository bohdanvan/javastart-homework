package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class ArrayPositiveFinder {

    public static void main(String[] args) {
        System.out.println("findFirstPositiveElemIndex(new int[]{-3, 0, -1, 4, -2, 5}) = " +
                findFirstPositiveElemIndex(new int[]{-3, 0, -1, 4, -2, 5})); // 3
        System.out.println("findFirstPositiveElemIndex(new int[]{-3, 0, -1, -4, -2, -5}) = " +
                findFirstPositiveElemIndex(new int[]{-3, 0, -1, -4, -2, -5})); // -1
        System.out.println();

        System.out.println("findLastPositiveElemIndex(new int[]{-3, 0, -1, 4, -2, 5}) = " +
                findLastPositiveElemIndex(new int[]{-3, 0, -1, 4, -2, 5})); // 5
        System.out.println("findLastPositiveElemIndex(new int[]{-3, 0, -1, -4, -2, -5}) = " +
                findLastPositiveElemIndex(new int[]{-3, 0, -1, -4, -2, -5})); // -1
    }

    public static int findFirstPositiveElemIndex(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findLastPositiveElemIndex(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i] > 0) {
                return i;
            }
        }
        return -1;
    }
}
