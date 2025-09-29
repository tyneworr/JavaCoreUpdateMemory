package org.example.DMD;

public class taskMassSlojniy4 {
    public static void main(String[] args) {

        int[] mass = {6, 2, 4, 1, 6};
        if(sum(mass) == 0) {
            System.out.println("Соблюдайте условие");
        } else {

            System.out.println(sum(mass));
        }
    }

    public static int minMass(int[] mass) {
        int result = mass[0];
        int count = 0;
        for(int i = 0; i < mass.length; i++) {
            if(result > mass[i]){
                result = mass[i];
                count = i;
            }
        }
        return count;
    }

    public static int maxMass(int[] mass) {
        int result = mass[0];
        int count = 0;
        for(int i = 0; i < mass.length; i++) {
            if(result < mass[i]){
                result = mass[i];
                count = i;
            }
        }
        return count;
    }

    public static int sum(int[] mass) {
        int min = minMass(mass);
        int max = maxMass(mass);
        int result = 0;
        if(max > min) {
            for(int i = min +1; i < max; i++){
                result += mass[i];
            }
        } else if (min > max) {
            int pereliv = min;
            min = max;
            max = pereliv;
            for(int i = min +1; i < max; i++){
                result += mass[i];
            }
        }
        return result;
    }
}
