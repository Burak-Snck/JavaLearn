package challenge06;

import java.util.Scanner;

public class Task06 {

    /* task ->
    İki integer sayının eşitliğini kontrol eden java methodunu yazınız.

    num1 = num2 => true
    */


    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı =input.nextInt();
        int sayı2 =input.nextInt();

        System.out.println(esitlik(sayı, sayı2));


    }

    private static String esitlik(int sayı, int sayı2) {

       return  (sayı == sayı2 ? "true ": "false");
    }

}




