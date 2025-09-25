package org.example.DMD;

public class task5 {
    public static void main(String[] args) {
        doGlasnoy();
        doGlasnoyWhile();
        char b = 'b';
        System.out.println((int) b);
    }

    public static void doGlasnoy() {
        for (char letter = 'b'; !glasnaya(letter); letter++) {
            System.out.println("for " + letter);
        }
    }

    public static void doGlasnoyWhile() {
        char letter = 'b';
        while (!glasnaya(letter)) {
            System.out.println("While " + letter);
            letter++;
        }
    }

    public static boolean glasnaya(char letter) {
        return letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' || letter == 'y';
    }
}