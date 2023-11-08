package challenge06;

import java.util.Scanner;

public class Task02 {

    // task-> girilen tamsayının tek-çift olmasını kontrol eden method create ediniz.

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı =input.nextInt();
        çifttek(sayı);




    }//main sonu

    private static void çifttek(int sayı) {

        System.out.println((sayı % 2 == 0 ? "çift" : "tek"));

    }
}//Class sonu




