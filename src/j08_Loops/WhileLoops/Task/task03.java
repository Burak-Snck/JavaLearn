package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        //task-> girilen tamsayı için çarpım tablosu print eden code create ediniz
        //input: 8-> output :8x1=8, 8x2=16... 8x10=80

        Scanner input = new Scanner(System.in);
        System.out.println("  rakam gir");
        int carp = input.nextInt();

        for (int i = 1; i <=10; i++) {
            System.out.println(carp +"x"+i +"="+(carp*i));


        }
         int i=1;
        while (i<=10){

            System.out.println(carp +"x"+i +"="+(carp*i));
            i++;
        }


    }
}
