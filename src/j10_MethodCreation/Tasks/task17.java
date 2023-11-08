package j10_MethodCreation.Tasks;

import java.io.OptionalDataException;
import java.util.Scanner;

public class task17 {

    public static void main(String[] args) {

          /*
          Task-> girilen bir tamsayıyı  tersinden print eden METHOD create ediniz
          input:1453
          output:3541

       */
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number:");
         int sayı = input.nextInt();


        System.out.println(tersno(sayı));


    }

    private static String tersno(int sayi) {
        String sonuç="";
        String terssayı =String.valueOf(sayi);
        for(int i= terssayı.length()-1; i>=0; i--){

          sonuç += terssayı.charAt(i);


        }
        return sonuç;
    }



}
