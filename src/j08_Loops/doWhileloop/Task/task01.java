package j08_Loops.doWhileloop.Task;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
// task-> girilen 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...


        Scanner input = new Scanner(System.in);
        int sayı=input.nextInt();




        do {
            System.out.println("bir sayı giriniz : ");
            sayı = input.nextInt();
        }
        while (sayı >= 13);// sayının 13 den kucuk olmama sartı
        System.out.println(sayı + " için olaaaaa kazandınız :) ");



    }
}
