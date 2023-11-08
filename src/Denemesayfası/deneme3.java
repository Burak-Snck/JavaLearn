package Denemesayfası;

import java.util.Scanner;

public class deneme3 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("gün sayısını giriniz");
        int günsay = input.nextInt();


        int bulunangün = günsay+(100%7);
        switch (bulunangün) {
            case 1:
                System.out.println("ptesi");
                break;
            case 2:
                System.out.println("salı");
                break;
            case 3:
                System.out.println("çarşamba");
                break;
            case 4:
                System.out.println("perşe");
                break;
            case 5:
                System.out.println("cuma");
                break;
            case 6:
                System.out.println("ctesi");
                break;
            case 0:
                System.out.println("pazar");
                break;
            default:
                System.out.println("yanlış");


        }


    }
}
