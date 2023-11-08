package j07_StiringManipulation;

import java.util.Scanner;

public class C03_CharAt {

    public static void main(String[] args) {


           /*
charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
 */



    /*
charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
Çoooğğğ önemli ->  index değeri her zaman 0'dan başlar.-> ucağın koltuk nosu 0'dan başlar
 */

        String qa="muhammet team leader";
        System.out.println(qa);
        System.out.println(qa.charAt(5));
         char yedincikarakter=qa.charAt(7);
        System.out.println(yedincikarakter);

        //son karakteri yazdır


        System.out.println(qa.charAt(qa.length()-1));

        System.out.println(qa.length());

        //task-> Girilen bir String ifadenin ortadaki karakterini print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("metin giriniz");
        String metin = input.nextLine();
        if (metin.length()%2==0){
            System.out.println("orta karakter yok");
        }else{
            System.out.println(metin.charAt(metin.length()/2));

        }




    }
}
