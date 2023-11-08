package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class tas13 {
    public static void main(String[] args) {


          /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.
​
         */
        Scanner input = new Scanner(System.in);
        System.out.println("String gir");
        String kelime = input.next();
        String tersKelime = "";

        for(int i =kelime.length()-1; i >= 0; i--) {


            tersKelime+=kelime.charAt(i);

        }

        System.out.println(kelime);
        System.out.println(tersKelime);
    }
}
