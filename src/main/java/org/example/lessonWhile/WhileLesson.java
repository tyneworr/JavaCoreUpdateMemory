package org.example.lessonWhile;

public class WhileLesson {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int value = 10;
        whileMethod(value);
        dododo(value);
    }

    private static void dododo(int value) {
        do {
            System.out.println("odna iteraciya");
        } while (value < 10);
    }

    private static void whileMethod(int value) {
        while (value > 0) {
            System.out.println(value);
            value = value - 1;
            value--;
        }
    }
}
