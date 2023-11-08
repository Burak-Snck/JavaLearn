package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task07 {

    public static void main(String[] args) {

        // Task-> girilen 5 sayının en buyugunu print eden code create ediniz


        int i = 1;
        int büyük=0;
        while (i<6){

            Scanner input=new Scanner(System.in);
            System.out.print("değer gir" );
            i++;
            int sayi = input.nextInt();
            if(büyük>sayi){

            }else{
                büyük=sayi;
            }


        }
        System.out.println(büyük);
    }
}
