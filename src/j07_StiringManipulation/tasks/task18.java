package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task18 {
    public static void main(String[] args) {

         /* Task->
        Girilen ad soyad bilgilerinin ilk harflerini buyuk harf print eden code create ediniz..
​
              */
        Scanner input=new Scanner(System.in);
        System.out.println("ad soyad giriniz");
        String adsoyad=input.nextLine();
        //System.out.println("adınız : "+ adsoyad.substring(0,1).toUpperCase()+ adsoyad.substring(1,(adsoyad.indexOf(" "))).toLowerCase()
          //     +"\n" + "soyadınız : " +adsoyad.substring(adsoyad.indexOf(" ")+1,adsoyad.indexOf(" ")+2).toUpperCase()+
            //    adsoyad.substring(adsoyad.indexOf(" ")+2).toLowerCase());

        System.out.println(adsoyad.substring(0,1).toUpperCase()+adsoyad.substring(1,adsoyad.indexOf(" ")).toLowerCase()+ " "+
                adsoyad.substring(adsoyad.indexOf(" ")+1,adsoyad.indexOf(" ")+2).toUpperCase() +
                adsoyad.substring(adsoyad.indexOf(" ")+2).toLowerCase());

    }
}
