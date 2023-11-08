package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("agam bişey giresen : ");
        String str = input.next();
        char c1=str.charAt(0);


        for (int i = 0; i < str.length(); i++) {
            // if (i%2==0){//index çift kontrolu
            //     str.substring(i,i+1).toUpperCase();

            // }else str.substring(i,i+1).toLowerCase();
            System.out.print(
                    (i % 2 == 0) // index cift olma sart
                            ? str.substring(i, i + 1).toUpperCase() // T->index cift ise o index str  buyuk harf
                            : str.substring(i, i + 1).toLowerCase());// F->index tek ise o index str  kucuk harf
        }

    }
}




