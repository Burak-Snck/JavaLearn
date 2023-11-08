package j11_Arrays.tasks;

import java.util.Scanner;
import java.util.logging.SocketHandler;

public class task004 {

    // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("boyut giriniz");
        int arr[] = new int[input.nextInt()];
        int toplam=0;
        int count=0;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i+"ninci indeksi giriniz");
         arr[i]=input.nextInt();
         toplam+=arr[i];
        }
        double ortalama=toplam/arr.length;
        for (int i = 0; i < arr.length; i++) {
           if(arr[i]>ortalama) {
               count++;
           }

        }
        System.out.println(count);
    }

}



