package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {


        Scanner input=new Scanner(System.in);
        System.out.println("kaç adet tam sayı gireceksin");
        int sayı= input.nextInt();
        int toplam=0;
        int j=1;


        while (j<=sayı){
            System.out.println("sayı giriniz");
            int i =input.nextInt();

            System.out.println(toplam+=i);
            j++;


        }

        System.out.println(toplam);


    }
}
