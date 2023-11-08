package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task003 {
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
         public static void main(String[] args) {

             Scanner input=new Scanner(System.in);
             System.out.println("boyut giriniz");
             int arr[]=new int[input.nextInt()];
             for(int i=0;i<arr.length;i++){
                 System.out.println(i+"inci indeksi bir sayı giriniz");

                 arr[i]=input.nextInt();
             }
             int indeksone=arr[0];
             for(int i=0; i<arr.length-1;i++){
                 arr[i]=arr[i+1];



             }
             arr[arr.length-1]=indeksone;


             System.out.println(Arrays.toString(arr));

         }
}
