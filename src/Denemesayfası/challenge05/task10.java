package Denemesayfası.challenge05;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Write any number");
        int num = scn.nextInt();
        boolean yaparmı =false;
        for (int i = 0; i <num/3 ; i++) {
            if (Math.pow(3,i)== num){
                yaparmı =true;

            }
            System.out.println(i);
        }
        System.out.println(yaparmı? num + " is a power of 3." : " is not a power of 3.");




    }
}
