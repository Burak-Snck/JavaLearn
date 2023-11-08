package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task09 {


    public static void main(String[] args) {

// task-> girilen şifrenin asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" print edin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        Scanner input = new Scanner(System.in);
        boolean sart = true;
        while (sart) {
            System.out.println("şifre ");
            String sifre = input.nextLine();
            if (!Character.isLowerCase(sifre.charAt(0))) {

                System.out.println("Sifre kucuk harf ile baslamalı");

            }
            if (!Character.isDigit(sifre.charAt(sifre.length() - 1))) {

                System.out.println("sifrenin son karakteri rakam olmalı");

            }
            if (sifre.contains(" ")) {

                System.out.println("sifre bosluk icermemeli");

            }
            if (sifre.length() < 10) {

                System.out.println("sifre en az 10 karakterli olmalı");

            }else{

                System.out.println("Şifre başarılıo");
                break;

            }


        }
    }


}

