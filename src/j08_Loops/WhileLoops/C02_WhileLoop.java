package j08_Loops.WhileLoops;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {

        //girilrn tam sayının rakamları toplamı isteeyen kod yz



        Scanner input=new Scanner (System.in);
        System.out.println( "tam sayı gir");
        int sayi = input.nextInt();

        int toplam=0;


        while (sayi > 0) { //sayı 0 dan byk olana kadar ne diyorsa yap
            toplam += sayi % 10;//sayının birler basamağı kutuya atıldı
            sayi /= 10; //sayının 10 bölümü yeni değer olarak atandı
        }

        System.out.println("Rakamların toplamı: " + toplam);




    }
}
