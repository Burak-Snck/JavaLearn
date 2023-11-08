package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {


        /*
		Task-> girilen bir String'deki rakam sayısını print eden code create ediniz
		 */

        Scanner input = new Scanner(System.in);
        System.out.println("Bir string giriniz: ");
        String str = input.nextLine();
        int rakamsayı=0;

       for (int i = 0; i <str.length(); i++) {

        if(Character.isDigit(str.charAt(i))) {
            rakamsayı++;
        }

       }
        System.out.println(rakamsayı);
    }


}

