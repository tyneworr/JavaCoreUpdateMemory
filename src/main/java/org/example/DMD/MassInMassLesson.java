package org.example.DMD;

public class MassInMassLesson {
    public static void main(String[] args) {
        massInMass();
        massInMass2();
        massInMassInMass();
    }

    public static void massInMass(){
        int[][] massInMass = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        for (int i = 0; i < massInMass.length; i++) {
            int[] mass = massInMass[i];
            for (int j = 0; j < mass.length; j++) {
                System.out.print(mass[j] + " ");
            }
            System.out.println();
        }
    }

    public static void massInMass2(){
        int[][] massInMass = {
                {1, 2, 3, 1},
                {4, 5, 6, 4},
                {7, 8, 9, 7}
        };
        for (int i = 0; i < massInMass.length; i++) {
            for (int j = 0; j < massInMass[i].length; j++) {
                System.out.print(massInMass[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void massInMassInMass() {
        int[][][] superMass = {
                {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                }
        };
        for (int i = 0; i < superMass.length; i++) {
            for (int j = 0; j < superMass[i].length; j++) {
                for (int k = 0; k < superMass[i][j].length; k++) {
                    System.out.print(superMass[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}