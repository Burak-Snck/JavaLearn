package j08_Loops.WhileLoops.Task;

import java.util.Random;
import java.util.Scanner;

public class task06 {

    public static void main(String[] args) {

          /*
        1 ile 100    sayi arasındaki  pc'nin atadığı tamsayıyı kullanıcıya  tahmin ettirip tahmin sayısını print eden  code create ediniz.
         */

        Random rand = new Random();
        int bilgisayarinSayisi = rand.nextInt(100) + 1; // 1 ile 100 arasında rastgele bir sayı üret

        Scanner scanner = new Scanner(System.in);

        int tahmin;
        int tahminSayisi = 0;

        System.out.println("1 ile 100 arasinda bir sayi tahmin ediniz.");

        do {
            System.out.print("Tahmininizi giriniz: ");
            tahmin = scanner.nextInt();

            tahminSayisi++;

            if (tahmin < bilgisayarinSayisi) {
                System.out.println("Daha buyuk bir sayi giriniz.");
            } else if (tahmin > bilgisayarinSayisi) {
                System.out.println("Daha kucuk bir sayi giriniz.");
            } else {
                System.out.println("Tebrikler! Dogru tahmin ettiniz.");
                System.out.println("Tahmin sayisi: " + tahminSayisi);
            }
        } while (tahmin != bilgisayarinSayisi);

        scanner.close();
    }
}



