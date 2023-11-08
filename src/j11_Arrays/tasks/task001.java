package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {


            //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("bir boyut giriniz");
        int boyut=input.nextInt();
        int arr[]=new int[boyut];
        for(int i=0; i<arr.length;i++){
            System.out.println(i+"inci indeksi bir sayı giriniz");

            arr[i]=input.nextInt();


        }
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
      for(int i=arr.length-1 ;i>=0;i--){
          System.out.println(arr[i]+"**");

      }

    }
}
