package com.bvan.javastart.hw.stars1.arrays;

import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class ArrayFiller {

    public static void main(String[] args) {
        int[] array = new int[5];
        fill(array, 20);
        System.out.println(Arrays.toString(array));
    }

    public static void fill(int[] array, int filler) {
        for (int i = 0; i < array.length; i++) {
            array[i] = filler;
        }
    }
}
