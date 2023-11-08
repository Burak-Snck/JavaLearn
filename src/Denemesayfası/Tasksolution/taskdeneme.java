package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class taskdeneme {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(kuvvetbulma(sayi));

    }

    private static boolean kuvvetbulma(int sayi) {
        int count =0;
        if (sayi <= 0) {
            return false;
        }
        while (sayi % 3 == 0) {
            System.out.println("l");
            sayi /= 3;
            count++;
        }

        return sayi%3 ==1;
    }
}

