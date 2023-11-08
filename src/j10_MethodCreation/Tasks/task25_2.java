package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task25_2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number:");

        int sayi = input.nextInt();

        int sonuc = faktoriyel(sayi);
        System.out.println(sayi + "! = " + sonuc);
    }

    private static int faktoriyel(int sayi) {
        if (sayi == 0 || sayi == 1) {
            return 1;
        } else {
            return sayi * faktoriyel(sayi - 1);
        }
    }
}

