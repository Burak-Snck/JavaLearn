package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {


        //task-> girilen ad ve soyadın ilk harfleri buyuk diğer harflerini küçük print eden METHOD create ediniz
        // Scanner input = new Scanner(System.in);
        // System.out.println("adınızı giriniz :");
        // String ad = input.next();
        // System.out.println("soyadınızı giriniz : ");
        // String soyad = input.next();

        //  adSoyadHarfKontrol1(ad, soyad);
        String ferhatBey = adSoyadHarfKontrol2("fErhaT", "gRacias");
        System.out.println("ferhatBey = " + ferhatBey);
        //    System.out.println(adSoyadHarfKontrol2(ad, soyad));//
        System.out.println(adSoyadHarfKontrol3());

    }//main sonu

    private static void adSoyadHarfKontrol1(String a, String s) {// 2 str p'li void meth
        System.out.println(a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() +
                " " + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase());


    }

    private static String adSoyadHarfKontrol2(String a, String s) {// 2 str p'li Str return meth
        //   String yeniAS = a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() +
        // " " + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();

        //  return yeniAS;
        return a.substring(0, 1).toUpperCase() + a.substring(1).toLowerCase() +
                " " + s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    //p'siz return type meth...


    private static String adSoyadHarfKontrol3() {// p'siz Str return  meth.

        Scanner input = new Scanner(System.in);
        System.out.println("adınızı giriniz :");
        String ad = input.next();
        System.out.println("soyadınızı giriniz : ");
        String soyad = input.next();


        return ad.substring(0, 1).toUpperCase() + ad.substring(1).toLowerCase() +
                " " + soyad.substring(0, 1).toUpperCase() + soyad.substring(1).toLowerCase();


    }


}// Class sonu

