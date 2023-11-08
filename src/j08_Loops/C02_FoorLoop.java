package j08_Loops;

import java.util.Scanner;

public class C02_FoorLoop {
    public static void main(String[] args) {

        //girilrn sayıdan 100 e kadar  4 ün katı olan tam sayıları yan yana print eden kod crate ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı =input.nextInt();

        if (sayı<100) {

            for (int i = sayı; i <= 100; i++) {

                if (i % 4 == 0) {
                    System.out.print(i + " ");
                }
                System.out.println("mmc");

            }
        }
        else {
            System.out.println("100 den küçük gir");
        }






    }
}
