package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task09 {

    public static void main(String[] args) {


  /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1
​
​
            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1
​
            şekli print eden code create ediniz
         */

        Scanner input = new Scanner(System.in);
        System.out.print("boyut giriniz");
        int boyut = input.nextInt();

        for(int i = 1; i <=boyut; i++) {
            for(int boyut2=1 ; boyut2<=boyut ; boyut2++ ){
                System.out.print(boyut2==i ?  1  : 0 );
            }
            System.out.println();
        }

    }
}
