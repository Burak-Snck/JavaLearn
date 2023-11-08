package Denemesayfası.challenge05;

import java.util.Scanner;

public class Task02_SayiToplam {

    /*
    Task->
       Kullanicidan sayilar girmesini isteyin
     * ve girdigi sayilari toplayip yazdirin.
     * yeni sayi isteyin
     * girilen sayilarin toplami 100 'u gecerse
     * "... kere sayi girdin. Bu kadar sayi yeter" yazdirin ve oyunu bitirin
     *
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        int toplam = 0;
        int count = 0;

        while (true) {
            System.out.println("bir sayı gir");
            int sayı = input.nextInt();
            toplam+=sayı;
            count++;

           if (toplam>100){
               System.out.println(toplam);
               break;

           }


        }
        System.out.println(count);
    }
}