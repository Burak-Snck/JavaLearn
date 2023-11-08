package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {

        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        int arr[]=new int[7];

        for(int i=0; i<7; i++){
            System.out.println(i+1+"inci elemanı giriniz");
            arr[i]=input.nextInt();
            if(arr[i]%2==1){
                System.out.println((arr[i]));
            }
        }


    }
}
