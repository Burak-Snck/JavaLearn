package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        // task-> girilen sayının faktöriyelini print code create ediniz
        //falan faktöriyel=1'den falana kadar tamsayıların çarpımı->1*2*3*...*falan

        Scanner input = new Scanner(System.in);
        System.out.println("sayı giriniz : ");
        int sayı = input.nextInt();
        int fak = 1;

        for (int i = sayı; i >=1 ; i--){

            fak*=i;

        }

        System.out.println(fak);



    }
}
