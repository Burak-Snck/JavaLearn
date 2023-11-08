package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task014 {
    public static void main(String[] args) {

        //Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.


        Scanner scan = new Scanner(System.in);
        System.out.println("1.sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2.Sayiyi giriniz");
        int sayi2 = scan.nextInt();
        int i = 1;
        int ekok = 1;

        while (i <= sayi1 * sayi2) {

            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ekok = i;

            }
            i++;

        }
        System.out.println(ekok);
    }
}
