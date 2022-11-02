package Lottery;

import java.util.Arrays;

public class Lottery {

    public static void main(String[] args) {
        int[] Array1 = new int[7];

        for (int j = 0; j < Array1.length; j++)
            Array1[j] = (int) (Math.random() * 10);//

        int[] Array2 = new int[]{3, 7, 9, 6, 5, 8, 1};
        Arrays.sort(Array1);
        Arrays.sort(Array2);
        System.out.println(Arrays.toString(Array1));
        System.out.println(Arrays.toString(Array2));
        for (int j = 0; j < Array2.length; j++) {
            int numberOfMatches = 0;
            for (j = 0; j < Array2.length; j++) {
                if (Array1[j] == Array2[j]) numberOfMatches++;
            }
            System.out.println("Колличество совпадений: " + numberOfMatches);

        }
    }
}