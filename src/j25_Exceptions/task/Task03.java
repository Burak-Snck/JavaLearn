package j25_Exceptions.task;

import java.util.Scanner;

public class Task03 {

    /*
    int v  - int f  isminde 2 adet parametresi olan 'ortalama' isminde bir method create ediniz.
      int v = vize
      int f = final

      Eğer  vize 100 den büyük, veya final 100'den büyük, veya vize 0'dan küçük, veya final 0'dan küçük ise,
      Sistem ArithmeticException hatası versin ve "Notlar 0-100 arasında olmalı" mesajını return edin.
      Diğer durumlarda ise,
      vizenin yüzde 40 ını, finalin yüzde 60 toplayarak ortalama hesplayan pr create ediniz.
      vizeye 120, finale 80 girin.

      Programın çalışmasını sağlayın. (handle edin)
       */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println(" not gir");
        int vize;
        int fin;
        while (true) {

            try {
                vize = input.nextInt();
                if (vize > 100 || vize < 0) {
                    System.out.println("100 den az 0 dan çok olmalı");
                    throw new IllegalArgumentException();
                } else break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + "doğru gir");


            }


        }

        while (true) {


            try {
                fin = input.nextInt();
                if (fin  > 100 || fin < 0) {
                    System.out.println("100 den az 0 dan çok olmalı");
                    throw new IllegalArgumentException();
                } else break;
            } catch (Exception e) {
                System.out.println(e.getMessage() + "doğru gir");


            }


        }
        System.out.println("ortalama(vize ,fin) = " + ortalama(vize, fin));
    }

    public static double ortalama(int v, int f) {
        return  (v*0.40 +f*0.60);

    }


}
