package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("boyut giriniz");
        int arr[] = new int[input.nextInt()];

        int k=0;

        for(int i = 0; i < arr.length; i++)       {
            System.out.println(i +"inci indeksi gir");
            arr[i] = input.nextInt();

        }
        System.out.println("ilk yazdığımız" + Arrays.toString(arr));
        int yeniarr[]=new int[arr.length];
        for(int i =arr.length - 1; i >= 0; i--){
          yeniarr[k]=arr[i];
          k++;

        }
        System.out.println(Arrays.toString(yeniarr));






    }
}
