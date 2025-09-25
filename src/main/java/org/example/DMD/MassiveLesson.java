package org.example.DMD;

public class MassiveLesson {
    public static void main(String[] args) {
        methodMassive();
    }

    private static void methodMassive() {
        int[] mass = {1, 2, 4, 8};
        System.out.println(mass[1]);
        System.out.println();

        char[] massChar = new char[3];
        massChar[2] = 'A';
        System.out.println(massChar[0]);
        System.out.println(massChar[2]);
        System.out.println();

        for (int i = 0; i < mass.length; i++) {
            System.out.println(mass[i]);
        }
    }
}