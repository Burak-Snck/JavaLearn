package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task01 {

    public static void main(String[] args) {


        /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */

        Scanner input = new Scanner(System.in);

        System.out.println("başlama character giriniz : ");
        char startChar = input.next().charAt(0);

        System.out.println("bitis character giriniz : ");
        char endChar = input.next().charAt(0);

        do {
            System.out.print(startChar + " ");
            startChar = (char) (startChar + 1);// mevcut char'ı bir sonrakine atamak için-> a->b->c

        }
        while (startChar <= endChar);

    }


}

