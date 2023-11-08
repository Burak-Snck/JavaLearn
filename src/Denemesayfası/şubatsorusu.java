package Denemesayfası;

import java.util.Scanner;

public class şubatsorusu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("ay giriniz");
        String ay = input.nextLine();

        switch (ay) {
            case " ocak":
            case "mart":
            case " mayıs":
                System.out.println("ay 31 çeker");
                break;
            case "nisan ":
            case "eylül":
                System.out.println("ay 30 çeker ");
                break;
            case "şubat":
                System.out.println("yıl giriniz");
                int yıl = input.nextInt();
                if (yıl % 4 == 0 && (yıl % 100 != 0 || yıl % 400 == 0)) {
                    System.out.println("28");
                } else {
                    System.out.println("29 çeker");
                }
                break;
            default:
                System.out.println("yanlış giriş yaptınız");
                break;
        }


    }
}
