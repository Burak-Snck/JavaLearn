package Denemesayfası.challenge05.challenge07;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
     /*Kullanıcıdan bir harf girmesini isteyiniz. Girilen harf sesli ise Sesli harf olduğunu,
     değilse sessiz harf olduğunu ekrana yazdırsın. Girdiği değer harf değilse yada
     1 karakterden fazla ise hata mesajı göstersin. (Test girilen harfi büyük yada küçüklüğüne duyarlıdır.)
     Sesli harfler: a,e,i,o,u

     Test Data:
     a
     Beklenen Çıktı:
     a harfi sesli harfdir.

     Test Data:
     d
     Beklenen Çıktı:
     d harfi sesiz harftir.

     Test Data:
     we  yada  %

     Beklenen Çıktı:
     Yanlis karakter girdiniz!

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("bir harf gir");
        char ch=scan.next().charAt(0);
     boolean sesli=false;
        switch (ch) {
            case 'i':
                sesli = true;
                break;
            case 'e':
                sesli = true;
                break;
            case 'a':
                sesli = true;
                break;

        }
        if(sesli==true){
            System.out.println("sesli");
        }else{
            System.out.println("sessiz");
        }
    }
}
