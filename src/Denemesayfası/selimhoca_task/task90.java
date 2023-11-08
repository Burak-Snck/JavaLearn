package Denemesayfası.selimhoca_task;

import java.util.Scanner;

public class task90 {
    public static void main(String[] args) {



        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayı =input.nextInt();
        int sayı2 =input.nextInt();

        System.out.println(esitlik(sayı, sayı2));


    }

    private static boolean esitlik(int sayı, int sayı2) {

        return  (sayı == sayı2 ? true : false);

    }
}
