package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner scn = new Scanner(System.in);
        System.out.println("Say a character....");
        String chr = scn.next();

        char character = chr.charAt(0);
        for (int j = 1; j <= 10; j++) {
            char newChar = (char) (character + j);
            System.out.print(j + "." + newChar + " ");
        }


    }
}
