package org.example.DMD;

public class Task3 {
    public static void main(String[] args) {
        int buyYear = 1626;
        int thisYear = 2025;
        double price = 24;
        double procent = 0.05;
        double result = indeec(buyYear, thisYear, price, procent);
        System.out.println(result);
        double result2 = indeecFor(price);
        System.out.println(result2);
    }

    public static double indeec(int buyYear, int thisYear, double price, double procent) {
        double result = price;
        while (thisYear >= buyYear + 1) {
            double percent = result * procent;
            result += percent;
            buyYear++;
        }
        return result;
    }

    public static double indeecFor(double price) {
        double result = price;
        for (int i = 1626 + 1; i <= 2025; i++) {
            double percent = result * 0.05;
            result += percent;
        }
        return result;
    }
}