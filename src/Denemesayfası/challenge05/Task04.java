package Denemesayfası.challenge05;

import java.util.Scanner;

public class Task04 {

    /*Task->
     Kullanıcıda x girilene kadar ekrana "Program çalışıyor" yazan
     ve x girildiğinde ise "Program bitti" print eden code create ediniz
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        while (true) {

                System.out.println("bir metin girin");
            String str = input.nextLine();
            if(str.charAt(0) == 'x'){
                break;


            }
            System.out.println("program çalışıyor");


        }
        System.out.println("x girdiniz çıktım ben de");
    }
}
