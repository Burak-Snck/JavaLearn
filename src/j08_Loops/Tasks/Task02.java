package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */

        Scanner input = new Scanner(System.in);
        System.out.println("metin gir");
        String kelime= input.next();
        String terskelime ="";
        for (int i= kelime.length()-1; i>=0 ;i--){
            terskelime+=kelime.charAt(i);
        }
        System.out.println(kelime);
        System.out.println(terskelime);



         if (kelime.equals(terskelime)){
             System.out.println("girilen ifade polindrome");



         }else {
             System.out.println("girilen ifaade poli değil");
         }

    }


}
