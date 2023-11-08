package j07_StiringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {

    /*
String iersinde istenen stringini varlığını kontrol eder boolean değer return eder..

char parametre --> CTE
 */

        // Task-> girilen bir metinde istenen kelimenin varlığını kontrol eden code create ediniz.
        String str1="başarı gayrete aşıktır";
        System.out.println(str1.contains("başarı"));
        System.out.println(str1.contains("a"));
        System.out.println(str1.contains("habanlar"));



        Scanner input=new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin=input.nextLine();
        System.out.println(metin.contains("bir")? "girilen"+(metin )+" metinde aradığınız kelime  vardır": "girilen metin yok");


    }
}
