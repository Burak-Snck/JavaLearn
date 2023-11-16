package j12_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task18 {

    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
   /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);

       degişim(sayilar);


    }

    private static void degişim(List<Integer> sayilar) {

        System.out.println("değiştirmek istediğiniz sırayı giriniz");
        int sayı=input.nextInt();


       sayilar.add(sayı);
        System.out.println(sayilar);
    }
}
