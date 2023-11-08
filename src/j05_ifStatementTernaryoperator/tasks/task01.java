package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giresen");
        int sayı = input.nextInt();

        if (sayı >= 100 && sayı <= 999) {
            System.out.println("sayı 3 basamaklı");
        }
        if (sayı >= 10 && sayı <= 99) {
            System.out.println("sayı 2 basamaklı");
        } else {
            System.out.println("ikiside değil");
        }



      /* Task->
       Girilen bir sayı için
       sayi 3 basamakli ise console ' a "3 basamakli"
       sayi 2 basamakli ise console'a "2 basamakli"
       sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
       */
            Scanner scan = new Scanner(System.in);
            System.out.println("sayi giriniz");
            int sayi = scan.nextInt();
            if ((sayi >= 100 && sayi <= 999) || (sayi <= -100 && sayi >= -999)) {
                System.out.println("Girilen sayi 3 basamakli bir sayidir");

            } else if ((sayi >= 10 && sayi <= 99) || (sayi <= -10 && sayi >= -99)) {
                System.out.println("Girilen sayi iki basakmaklidir");
            } else {
                System.out.println("girilrn sayi iki veya uc basamakli degildir");
            }



    }



}





