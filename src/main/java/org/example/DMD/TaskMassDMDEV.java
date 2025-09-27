package org.example.DMD;

public class TaskMassDMDEV {
    public static void main(String[] args) {
        int[] mass = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] mass2 = new int[10];
        for (int i = 0; i < mass2.length; i++) {
            mass2[i] = i + 101;
        }
        int[] massTask2 = new int[100];
        task1(mass);
        task1(mass2);
        task2(100);
        task22(massTask2);
    }

    public static void task1(int[] values) {
        for (int i = 0; i < values.length; i++) {
            System.out.println("task1 mass: " + values[i]);
        }
        for (int i = values.length - 1; i >= 0; i--) {
            System.out.println("task1 mass: " + values[i]);
        }
        for (int value : values) {
            System.out.println("task1 massForEach: " + value);
        }
        System.out.println();
    }

    public static void task2(int value) {
        int current = 0;
        for (int i = 1; i <= value; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                current++;
            }
        }
        int[] mass = new int[current];
        int current2 = 0;
        for (int i = 1; i <= value; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                mass[current2] = i;
                current2++;
            }
        }
        for (int i : mass) {
            System.out.print("task2 mass: " + i + ". ");
        }
        System.out.println();
    }

    public static void task22(int[] values) {
        System.out.println();
        int current = 0;
        for (int i = 1; current < values.length; i++) {
            if (i % 13 == 0 || i % 17 == 0) {
                values[current] = i;
                current++;
            }
        }
        for (int value : values) {
            System.out.print("task22 mass: " + value + ". ");
        }
        System.out.println();
    }
}