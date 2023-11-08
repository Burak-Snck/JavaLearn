package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task13 {
    public static void main(String[] args) {


          /*
        task-> girilen boyutta aşağıdaki şekli  print eden code create ediniz
          Örnek Ekran çıktısı
      *
      * *
      * * *
      * * * *

         */
        Scanner input = new Scanner(System.in);
      //  System.out.print("agam boyut giresen : ");
        //int boyut = input.nextInt();

        for (int i =1 ; i <5; i++) {
            for(int j =1 ; j<=i;j++) {

                  System.out.print("*");

            }
            System.out.println();
        }


    }
}
