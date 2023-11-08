package j11_Arrays.tasks;

import javax.swing.plaf.IconUIResource;
import java.util.Arrays;

public class task020 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz
        int[] arr = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 3;
        istenenleriYazdir(arr, istenmeyenEleman);

    }

    private static void istenenleriYazdir(int[] arr, int istenmeyenEleman) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == istenmeyenEleman) {
                count++;
            }
        }
        System.out.println(count);
        int k = 0;
        int yeniarr[] = new int[arr.length - istenmeyenEleman];
        for (int i = 0; i < arr.length; i++) {

            boolean b = false;

            if (arr[i] != 3) {

                yeniarr[k] = arr[i];
                b = true;
                k++;

            }
           else{
                b = false;
            }

        }

        System.out.println(Arrays.toString(yeniarr));
    }

}


