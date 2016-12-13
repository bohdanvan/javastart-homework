package com.bvan.javastart.hw.stars1.loops;

/**
 * @author bvanchuhov
 */
public class FactorialCalculator {

    public static void main(String[] args) {
        System.out.println("factorial(0) = " + factorial(0)); // 1
        System.out.println("factorial(1) = " + factorial(1)); // 1
        System.out.println("factorial(3) = " + factorial(3)); // 6
        System.out.println("factorial(15) = " + factorial(15)); // 1307674368000
        System.out.println("factorial(20) = " + factorial(20)); // 2432902008176640000
//        System.out.println("factorial(-1) = " + factorial(-1)); // IllegalArgumentException
//        System.out.println("factorial(21) = " + factorial(21)); // IllegalArgumentException
    }

    public static long factorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("factorial arg should be in the range (0..20): " + n);
        }

        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
