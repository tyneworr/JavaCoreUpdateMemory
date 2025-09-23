package org.example.lessonFor;

public class forLesson {
    public static void main(String[] args) {
        int value = 10;
        for (int i = 1; i <= value; value--) {
            if (value == 9) {
                continue;
            }
            System.out.println(value);
            if (value == 5) {
                break;
            }
        }
        forMethod();
    }

    private static void forMethod() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
