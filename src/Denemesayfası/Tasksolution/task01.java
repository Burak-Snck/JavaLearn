package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

   // task03  girilen sayı faktöriyel


        Scanner input=new Scanner(System.in);

        System.out.println( "bir sayı gir");
         int sayı=input.nextInt();
         int faktöriyel=1;

         for (int i=sayı ; i>=1; i--) {

             faktöriyel*=i;

         }
        System.out.println(faktöriyel);

//


    }
}
