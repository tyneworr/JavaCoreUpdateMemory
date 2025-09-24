package org.example.DMD;

public class taskCycleForWhile {
    public static void main(String[] args) {
        /**
         * Задачка на факториал чтсла с помощью цикла.
         */
        int x = 5;
        System.out.println(factorialFor(x));
        System.out.println(factorialWhile(6));
    }

    public static int factorialFor(int x) {
        int result = 1;
        if (x <= 0) {
            System.out.println("Введите положительное число");
            return 0;
        } else {
            for (int i = 1; i <= x; i++) {
                result *= i;
            }
        }
        return result;
    }

    public static int factorialWhile(int x) {
        int result = 1;
        int y;
        y = 1;
        while (y <= x) {
            result *= y;
            y++;
        }
        return result;
    }
}
