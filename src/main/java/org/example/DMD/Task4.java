package org.example.DMD;

public class Task4 {

    public static void main(String[] args) {
        int x = 12;
        System.out.println(prostoe(x));
        System.out.println(prostoeWhile(x));
    }

    public static boolean prostoe(int x) {

        boolean result = true;
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean prostoeWhile(int x) {
        boolean result = true;
        int i = 2;
        while (i < x) {
            if (x % i == 0) {
                result = false;
                break;
            }
            i++;
        }
        return result;
    }
}