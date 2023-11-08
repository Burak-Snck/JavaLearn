package j08_Loops.WhileLoops;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        // task06->girilen tamsayıya kadar sayıların toplamını  print eden code create ediniz
// System.out.println("   ***   Task06   ***   ");

        Scanner input=new Scanner (System.in);
        System.out.println( "tam sayı gir");
        int tamsayı = input.nextInt();
        int toplam=0;

        while (tamsayı>0) {

            toplam+=tamsayı;

            tamsayı--;


        }
        System.out.println(toplam);




    }
}
