package com.bvan.javastart.hw.stars1.conditions;

/**
 * @author bvanchuhov
 */
public class IdToToyNameConverter {

    public static void main(String[] args) {
        System.out.println("getToyName(2) = " + getToyName(2)); // Doll
//        System.out.println("getToyName(-1) = " + getToyName(-1)); // IllegalArgumentException
    }

    public static String getToyName(int id) {
        if (id == 0) return "Car";
        if (id == 1) return "Lego";
        if (id == 2) return "Doll";
        if (id == 3) return "Puzzle";
        throw new IllegalArgumentException("illegal toy id: " + id);
    }
}
