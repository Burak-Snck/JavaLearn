package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task28 {
    public static void main(String[] args) {

        // task-> girilen  bir char karakterden sonra gelen 10 karakteri prin eden code create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("bir char giriniz");
        char ch = input.next().charAt(0);
        for (int i = 1; i <= 10; i++) {
            //ch += 1;
           // System.out.println( ch);
            System.out.println((char)(ch+i));
        }

    }
}
