package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Gadın anam ele  birinci sayı gir : ");
        int sayi1 = input.nextInt();
        System.out.println("Gadın anam ele  ikinci sayı gir : ");
        int sayi2 = input.nextInt();
        int toplam = 0;

        if (sayi1 > sayi2) {
            for (int i = sayi2 + 1; i < sayi1; i++) {
                toplam += i;
            }
        } else if (sayi1 < sayi2) {
            for (int i = sayi1 + 1; i < sayi2; i++) {
                toplam += i;
            }
        }

        System.out.println("toplam = " + toplam);
    }
}





