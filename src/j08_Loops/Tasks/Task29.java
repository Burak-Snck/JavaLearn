package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK

        Scanner input=new Scanner(System.in);
        System.out.println("agam bişey giresen : ");
        String  str=input.next();
        for (int i=0; i<str.length(); i++){
            // if (i%2==0){//index çift kontrolu
            //     str.substring(i,i+1).toUpperCase();

            // }else str.substring(i,i+1).toLowerCase();
            System.out.print(
                    (i % 2 == 0) // index cift olma sart
                            ? str.substring(i, i + 1).toUpperCase() // T->index cift ise o index str  buyuk harf
                            : str.substring(i, i + 1).toLowerCase()// F->index tek ise o index str  kucuk harf
            );
        }

    }
}
