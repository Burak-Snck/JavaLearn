package interviewQuestions01;

import java.util.Scanner;


public class Q20_PrintEvenNumber {
    /* Task->
    Write a method named isEven that accepts an integer argument.
    The method should return true if the argument is even, or false otherwise.
    Girilen sayını tek-çiftlğini return eden method create ediniz.
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi gir");
        int sayi= input.nextInt();
        int bolenSayi=0;
        System.out.println("****For ile****");
        for (int i = -sayi; i <=sayi ; i++) {
            if(i==0){
                System.out.println("burası atlandı");
                continue;
            }
            if (sayi%i==0){
                bolenSayi++;
                System.out.print(i+" ");
            }
        }
        System.out.println();
        System.out.println(sayi+" saysinin "+bolenSayi+" tane tam boleni vardir");
    }
}//Class sonu
