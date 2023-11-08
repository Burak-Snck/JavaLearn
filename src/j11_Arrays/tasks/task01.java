package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {


        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Arrayin boyutunu giriniz");
        int boyut= input.nextInt();
        int[] arr=new int[boyut];//{0,0,0,0,0,0,0,0}
        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+".index elemani giriniz");
            arr[i]=input.nextInt();
        }
        System.out.println("Girilen array= "+ Arrays.toString(arr));
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {
            System.out.print(arr[i]+" ");
        }


    }
}
