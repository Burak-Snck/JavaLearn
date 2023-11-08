package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task13 {

    public static void main(String[] args) {
          /*
            Bir sayinin mutlak degerini hesaplamak icin ternary operatoru kullanarak kod yaziniz.
         */
        Scanner input=new Scanner (System.in);
        System.out.println("sayi giriniz");
        int sayı=input.nextInt();
        String durum="";
        durum = sayı>0 ? "pozitif" : "negatif";
        System.out.println(durum);




    }
}
