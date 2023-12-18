package Denemesayfası;

import java.util.Scanner;

public class x {


    static Scanner scan = new Scanner(System.in);

    public static int tamsayiGirisiAl() {
        int giris = 0;
        boolean gecerliGiris = false;

        do {
            try {
                System.out.print("Lütfen bir tamsayı giriniz: ");
                giris = Integer.parseInt(scan.nextLine());
                gecerliGiris = true;
            } catch (NumberFormatException e) {
                System.out.println("Hata: Geçerli bir tamsayı giriniz.");
            }
        } while (!gecerliGiris);

        return giris;
    }

    public static String metinGirisiAl() {
        String giris = "";
        boolean gecerliGiris = false;

        do {
            try {
                System.out.print("Lütfen bir metin giriniz: ");
                giris = scan.nextLine();
                gecerliGiris = true;
            } catch (Exception e) {
                System.out.println("Hata: Geçerli bir metin giriniz.");
            }
        } while (!gecerliGiris);

        return giris;
    }

    public static void main(String[] args) {
        int tamsayi = tamsayiGirisiAl();
        System.out.println("Girilen tamsayı: " + tamsayi);

        String metin = metinGirisiAl();
        System.out.println("Girilen metin: " + metin);
    }
}


