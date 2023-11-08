package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task19 {
     /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
     public static void main(String[] args) {



         Scanner input = new Scanner(System.in);
         System.out.println("birinci  kelimeyi  giriniz");
         String str = input.nextLine();
         System.out.println("ikinci kelimeyi giriniz");
         String str2 = input.nextLine();
         System.out.println((str.length() % 2 == 0) ? (str.substring(0, str.length() / 2)
                 + str2 + str.substring(str.length() / 2)) : "kelime2 kelime1 eklenemez");



     }

}
