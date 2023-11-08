package Denemesayfası.challenge05;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {



   /* HAFTANIN TASK'iiii :-)
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiği ana kadar aldigi toplam yolu ve
    yere vurma sayısını print eden  do while code blogu create ediniz.
    */


        Scanner scan = new Scanner(System.in);
        System.out.print("topun birakildigi ilk yuksekligi  giriniz : ");
        double yukseklik = scan.nextDouble();

        double toplamyol = 0;
        double count = 0;


        do {
            toplamyol += yukseklik;
            yukseklik *= 0.75;
            count++;


        } while (yukseklik > 1);



        System.out.println(toplamyol);
        System.out.println(count);


    }


}





