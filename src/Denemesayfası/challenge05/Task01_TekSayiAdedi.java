package Denemesayfası.challenge05;

import java.util.Scanner;

public class Task01_TekSayiAdedi {

    /* Task->
    Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ve adedini print eden code create ediniz.

   */
    public static void main(String[] args) {
   Scanner input=new Scanner (System.in);
        System.out.println("bir sayı girin");
   int sayı=input.nextInt();

   for(int i=0; i<sayı; i++){

       System.out.println(i%2==1 ? i : "");

   }


    }
}
