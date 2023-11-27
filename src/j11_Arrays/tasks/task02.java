package j11_Arrays.tasks;

import java.util.Arrays;

public class task02 {

    public static void main(String[] args) {

        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.

        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println(); // Her satırın sonunda yeni satıra geç
        }

    }


}
