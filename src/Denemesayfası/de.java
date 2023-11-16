package Denemesayfası;

import java.util.*;

public class de {

    public static void main(String[] args) {
        int[] dizi = {4, 1, 9, 5, 7, 2};

        int min = dizi[0];
        int max = dizi[0];

        for (int eleman : dizi) {
            if (eleman < min) {
                min = eleman;
            }
            if (eleman > max) {
                max = eleman;
            }
        }

        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);
    }


}



