package com.bvan.javastart.hw.stars1.arrays;

import com.bvan.common.Args;
import java.util.Arrays;

/**
 * @author bvanchuhov
 */
public class SequenceArrayCreator {

    public static void main(String[] args) {
        System.out.println("createSequenceArray(5): " + Arrays.toString(createSequenceArray(5)));
//        System.out.println("createSequenceArray(-1) = " + Arrays.toString(createSequenceArray(-1))); // IllegalArgumentException
    }

    public static int[] createSequenceArray(int size) {
        Args.checkSize(size);

        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }
        return array;
    }
}
