package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task18 {


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("bir kelime giriniz: ");
        String str = scan.nextLine();
        int rakamsayı = 0;
        for (int i = 0; i < str.length(); i++) {

            if(Character.isDigit(str.charAt(i)))

            rakamsayı++;
        }
        System.out.println("girilen string de rakam sayisi:" + rakamsayı);

    }
}

