package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
/*
       Interview Question

               Girilen  100’den kucuk bir tamsayi için
               1’den baslayarak girilen sayiya kadar tum sayilari
       		- Sayi 3’un kati ise sayi yerine “Java”
       		- Sayi 5’in kati ise sayi yerine “CAN'dır”
       		- Sayi hem 3’un hem 5’in kati ise sayi yerine “JavaCAN” print eden code create ediniz

*/

    Scanner input = new Scanner(System.in);
        System.out.println("sayı  gir");
       int sayı = input.nextInt();

       if (sayı<100){

           for (int i=1; i<=sayı; i++){
               if (i%3==0 && i%5==0 ){
                   System.out.println("javacan");

               }else if (i%3==0){
                   System.out.println("java");
               }else if  (i%5==0){
                   System.out.println("can");
               }
           }
       }else {
           System.out.println("100 den küçük gir");
       }


    }
}
