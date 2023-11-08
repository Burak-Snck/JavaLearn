package j08_Loops.WhileLoops;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
// task07->girilen tamsayının faktöriyelini  print eden code create ediniz



        System.out.println("   ***   Task07   ***   ");


        Scanner input=new Scanner (System.in);
        System.out.println( "tam sayı gir");
        int sayı = input.nextInt();

    int faktör=1;  //işleme etki etmeyecek boş kutu çarpmada 1 dir
        while (sayı>0) {
            faktör*=sayı;

            sayı--;

        }
        System.out.println(faktör);




    }
}
