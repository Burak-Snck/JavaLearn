package j29_Collection.p01_LinkedList;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Scanner;

public class task01 {

     /*
Task->
Node değerleri ,"Abdi bey" olan bir linkedList create ediniz.
Girilen bir String değeri linkedListte varlığını kontrol edip varsa silip "Agam eleman halledildi"
yoksa "Agam aradığınız kişiye ulaşılamadı" print eden code create edinzi

 */

    public static void main(String[] args) {


        LinkedList<String> ll1 = new LinkedList<>(Arrays.asList("Murat","javaCAN","javaTAR"));
        Scanner scanner = new Scanner(System.in);
        System.out.println("hangi kelime");
        String kelime=scanner.next();
        System.out.println(ll1.remove(kelime) ? "kelime silindi ": "yok ki zaten");


    }

}
