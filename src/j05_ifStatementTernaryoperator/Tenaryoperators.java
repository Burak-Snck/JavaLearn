package j05_ifStatementTernaryoperator;

import java.util.Scanner;

public class Tenaryoperators {
    public static void main(String[] args) {
  //    System.out.println("bir sayı giriniz");
      Scanner input = new Scanner(System.in);
  //    int sayı=input.nextInt();

  //
  //    System.out.println(sayı>0 ? "pozitif ": "negative");


   //tsk02
        System.out.println("bir sayı gir");
        int sayı1=input.nextInt();

        System.out.println("ikinci sayı gir");

        int sayı2=input.nextInt();
        System.out.println(sayı1>sayı2 ? "sayı1" : "sayı2");



        //TRİCK tenery çıktısı farklı tiplerde ise(Str int boolean vb ) hepsini kapsayan Object  tanımlayabilirsin



    }





}
