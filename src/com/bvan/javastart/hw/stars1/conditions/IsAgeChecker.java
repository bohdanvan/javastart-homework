package com.bvan.javastart.hw.stars1.conditions;

/**
 * @author Bohdan Vanchuhov
 */
public class IsAgeChecker {
    public static void main(String[] args) {
        System.out.println("isAge(25) =  " + isAge(25)); // true
        System.out.println("isAge(0) = " + isAge(0)); // false
        System.out.println("isAge(120) = " + isAge(120)); // true
        System.out.println("isAge(121) = " + isAge(121)); // false
    }

    public static boolean isAge(int age) {
        return age >= 1 && age <= 120;
    }
}
