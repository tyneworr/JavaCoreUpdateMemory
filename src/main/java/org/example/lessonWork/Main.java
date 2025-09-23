package org.example.lessonWork;

public class Main {
    public static void main(String[] args) {
        //Времена года
        System.out.println(Main.vremenaIf(4));
        System.out.println(Main.vremenaSwitch(7));
        //Оканчивается ли число на цифру 3
        System.out.println(Main.konec3(1234563));
        //Падежи рубля
        System.out.println(Main.padej(0));
        /**Опа
         * Проверка
         * на
         * многостроный
         * комментарий
         * оп
         * оп
         */

        /*АААА
        А это тогда че
        типа некрасивая версия
         */

    }

    public static String vremenaIf(int month) {
        if (month == 12 || month == 1 || month == 2) {
            return "Зима";
        } else if (month >= 3 && month <= 5) {
            return "Весна";
        } else if (month >= 6 && month <= 8) {
            return "Лето";
        }  else if (month >= 9 && month <= 11) {
            return "Осень";
        } else {
            return "Такого месяца нету";
        }
    }

    public static String vremenaSwitch(int month) {
        switch (month) {
            case 1:
                return "Зима";
            case 2:
                return "Зима";
            case 3:
                return "Весна";
            case 4:
                return "Весна";
            case 5:
                return "Весна";
            case 6:
                return "Лето";
            case 7:
                return "Лето";
            case 8:
                return "Лето";
            case 9:
                return "Осень";
            case 10:
                return "Осень";
            case 11:
                return "Осень";
            case 12:
                return "Зима";
            default:
                return "Такого месяца нету";
        }
    }

    public static boolean konec3(int x) {
        if (x % 10 == 3) {
            return true;
        }
        return false;
    }

    public static String padej(int x) {
        if (x >= 0) {
            if (x % 10 == 1 && x % 100 != 11) {
                return(x + " рубль");
            } else if ((x % 10 >= 2 && x % 10 <= 4) && !(x % 100 >= 12 && x % 100 <= 14)) {
                return(x + " рубля");
            } else  if (x==0) {
                return(x + " рублей");
            }
            else {
                return(x + " рублей");
            }
        }
        else {
            return "Не может быть отрицательного, введите правильно";
        }
    }

}