package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task04 {
    public static void main(String[] args) {

        /* TASK :
         * Girilen  isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olmasını control eden code create ediniz
         */

        Scanner input= new Scanner(System.in);

        System.out.println("3 harfliisim gir" );
        String adsoyad=input.nextLine();
        System.out.println(adsoyad.charAt(0)==adsoyad.charAt(1)|| adsoyad.charAt(0)==adsoyad.charAt(2)||
                adsoyad.charAt(1)==adsoyad.charAt(2) ? "aynı harfler ve harf  var ": "farklı harf veya harfler var");

    }
}
