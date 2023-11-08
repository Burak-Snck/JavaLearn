package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

           /*
        task-> girilen iki tamsayı arasındaki tamsayıları print eden code create ediniz.
        for loop & while lopp
         */
        Scanner input = new Scanner(System.in);
        System.out.println(" 2 sayı gir");
        int sayi1 = input.nextInt();
        int sayi2 = input.nextInt();

        // if (sayi1<sayi2){
        //   for (int i=sayi1; i<=sayi2; i++) {

        //     System.out.println(i);

        //}

        //}

        if (sayi1 < sayi2) {
            while (sayi1 <= sayi2) {
                System.out.println(sayi1 + " ");
                sayi1++;
            }
        } else if (sayi1 > sayi2) {
            while (sayi1 > sayi2) {
                System.out.println(sayi2 + " ");
                sayi2++;
            }
        }


    }
}
