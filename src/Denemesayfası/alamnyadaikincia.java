package Denemesayfası;

import java.util.Scanner;

public class alamnyadaikincia {
    public static void main(String[] args) {
        //almanyadaki 2. a yı karakterini return eden code yaz

        String str="Alamanyaç";
        System.out.println(str.indexOf('a',str.indexOf('a')+1));
        System.out.println(str.charAt(str.length()-1));


       // girilen isim ve soyismi büyük harf ile print eden kıd yaz bakalım hacı


        Scanner input = new Scanner(System.in);
        System.out.println("isim soyisim giriniz");

      //  System.out.println(adsoy.substring(0,1).toUpperCase()+adsoy.substring(1,adsoy.indexOf(" ")).toLowerCase()+
        //        (adsoy.substring(adsoy.indexOf(" ")+1,adsoy.indexOf(" ")+2).toUpperCase())+
          //      (adsoy.substring(adsoy.indexOf(" ")+2).toLowerCase()));

        String ad= input.next();
        String soyad= input.next();
       // System.out.println(ad.toUpperCase()+ " "+ soyad.toUpperCase());
       // System.out.println(ad.toUpperCase().charAt(1));









    }
}
