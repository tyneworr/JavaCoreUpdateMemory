package org.example.DMD;

public class Recursion {
    public static void main(String[] args) {
        int x = 7;
        System.out.println(factorial(x));
        System.out.println(factorialFor(x));
    }

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return x * factorial(x - 1);
    }

    public static int factorialFor(int x) {
        int result = 1;
        if (x == 1) {
            return result;
        }
        for (int i = 1; i <= x; i++) {
            result *= i;
        }
        return result;
    }
}
