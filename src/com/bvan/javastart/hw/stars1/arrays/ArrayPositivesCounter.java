package com.bvan.javastart.hw.stars1.arrays;

/**
 * @author bvanchuhov
 */
public class ArrayPositivesCounter {

    public static void main(String[] args) {
        System.out.println("countPositives(new int[]{-3, 0, -1, 4, -2, 5}) = " +
                countPositives(new int[]{-3, 0, -1, 4, -2, 5})); // 2
        System.out.println("countPositives(new int[]{-3, 0, -1, -4, -2, -5}) = " +
                countPositives(new int[]{-3, 0, -1, -4, -2, -5})); // 0
    }

    public static int countPositives(int[] array) {
        int count = 0;
        for (int elem : array) {
            if (elem > 0) {
                count++;
            }
        }
        return count;
    }
}
