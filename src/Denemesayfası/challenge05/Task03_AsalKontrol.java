package Denemesayfası.challenge05;

import java.util.Scanner;

public class Task03_AsalKontrol {
    /*
 Task->
  Girilen sayının asal olup olmadığını kontrol eden code create ediniz.
   */
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("bir sayı girin");
        int sayı=input.nextInt();
        int count=0;


        for(int i=1; i<sayı; i++) {

            if(sayı%i==0){
                count++;

            }

        }
        if (count>1){
            System.out.println("asal değil");
        }else if (count==1){
            System.out.println("asal");
        }


    }
}
