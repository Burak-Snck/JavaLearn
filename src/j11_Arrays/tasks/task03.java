package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task03 {

    public static void main(String[] args) {
         /*
        Task-> Verilen  bir arrayin tum elemanlarini
        bir sonraki konuma print eden code create ediniz
        input: [1,2, 3]
        output [2, 3, 1]
        */
        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");
        int boyut= input.nextInt();
        int[] arr=new int[boyut];//{0,0,0,0,0,0,0,0}
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+".index elemani giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println("Orjinal array="+ Arrays.toString(arr));
        int firstIndex=arr[0];
        for (int i = 0; i < arr.length-1; i++) {
            arr[i]=arr[i+1];
        }
        System.out.println(Arrays.toString(arr));
        arr[arr.length-1]=firstIndex;
        System.out.println("Degisen array= "+Arrays.toString(arr));
    }
}
