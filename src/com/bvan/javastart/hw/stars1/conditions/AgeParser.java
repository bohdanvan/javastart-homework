package com.bvan.javastart.hw.stars1.conditions;

/**
 * @author bvanchuhov
 */
public class AgeParser {

    public static void main(String[] args) {
        System.out.println("parseAge(\"25\") = " + parseAge("25")); // 25
//        System.out.println("parseAge(\"0\") = " + parseAge("0")); // IllegalArgumentException
    }

    public static int parseAge(String ageString) {
        int age = Integer.parseInt(ageString);
        if (!isAge(age)) { // use IsAgeChecker.isAge(age) instead
            throw new IllegalArgumentException();
        }
        return age;
    }

    public static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}
