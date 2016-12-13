package com.bvan.javastart.hw.stars1.conditions;

/**
 * @author bvanchuhov
 */
public class ToyNameToIdConverter {

    public static void main(String[] args) {
        System.out.println("getToyId(\"Doll\") = " + getToyId("Doll")); // 2
        System.out.println("getToyId(\"Hello\") = " + getToyId("Hello")); // IllegalArgumentException
    }

    public static int getToyId(String name) {
        switch (name) {
            case "Car": return 0;
            case "Lego": return 1;
            case "Doll": return 2;
            case "Puzzle": return 3;
            default: throw new IllegalArgumentException("illegal toy name: " + name);
        }
    }
}
