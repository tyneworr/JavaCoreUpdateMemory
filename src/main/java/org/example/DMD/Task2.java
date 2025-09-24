package org.example.DMD;

public class Task2 {
    public static void main(String[] args) {
        int x = 123;
        System.out.println(proizv(x));
        System.out.println(proizvWhile(x));
        System.out.println(drugoeProizv(x));
        System.out.println(drugoeProizvFor(x));
    }
    public static int proizv(int x) {
        int result = 0;
        for (int i = 1; i < x; i++) {
            result += i;
        }
        return result;
    }

    public static int proizvWhile(int x) {
        int result = 0;
        int i = 1;
        while (i < x) {
            result += i;
            i++;
        }
        return result;
    }

    public static int drugoeProizv(int x) {
        int result = 0;
        int currentX = x;
        while (currentX != 0) {
            result += currentX % 10;
            currentX = currentX / 10;
        }
        return result;
    }

    public static int drugoeProizvFor(int x) {
        int result = 0;
        for (int currentX = x; currentX > 0; currentX /= 10) {
            result += currentX % 10;
        }
        return result;
    }
}
