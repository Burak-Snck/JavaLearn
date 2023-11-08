package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task21_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("girilen sayisinin basamak sayisi = " + basamakSayisiVer(sayi));

    }

    private static int basamakSayisiVer(int sayi) {
        int count = 0;
        while (sayi != 0) {
            int i = sayi % 10;
            count++;
            sayi /= 10;
        }

        return count;
    }
}

