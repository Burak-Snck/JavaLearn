package interviewQuestions01;


import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayı asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("sayı gir");
        int sayı = input.nextInt();
        boolean asalmi = true;
        if (sayı >= 2) {
            for (int i = 2; i < sayı; i++) {
                if (sayı % i == 0) {
                    asalmi = false;
                    break;
                }


            }

            if (asalmi) {
                System.out.println("asal");

            } else System.out.println("asal dsseğil");
        } else {
            System.out.println("girilen sayı asal değildir");
        }
    }
}



