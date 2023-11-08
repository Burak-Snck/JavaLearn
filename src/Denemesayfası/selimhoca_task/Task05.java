package challenge06;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);
    // task->
    //Kullaniciya kac sayi toplamak istedigini sorun.
    //Kullanici 2,3 veya 4 degerini girerse, kullanicidan bu sayilari girmesini isteyin ve sayilarin toplamini yazdiriniz.
    //Kullanici toplamak istedigi sayi adedini 4'den buyuk girerse "cok sayi girdiniz, ben toplayamam" yazdiriniz.
    //2'den kucuk bir sayiyi girerse "En az 2 sayi girmelisiniz" yazdiriniz

    public static void main(String[] args) {


        System.out.println("kaç sayı toplayacan");
        int adet = input.nextInt();


        adet();


        if (adet == 2) {

            toplam();

        }
        else if (adet == 3) {
            for (int i = 1; i <= 3; i++) {

                System.out.println("sayı giriniz");
                int sayı = input.nextInt();

            }
        }
       else if (adet == 4) {
            for (int i = 1; i <= 3; i++) {


                System.out.println("sayı giriniz");
                int sayı = input.nextInt();

            }

        } else if (adet < 2) {
            System.out.println("az girdin");
        } else  {

            System.out.println("fazla sayı girdin");
        }


    }// main sonu

    private static void adet() {


    }

    private static void toplam() {
        int toplam = 0;
        for (int i = 1; i <= 2; i++) {


            System.out.println("sayı gg giriniz");
            int sayı = input.nextInt();

            toplam += sayı;


        }
        System.out.println(toplam);


    }// Class sonu
}