package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task19 {

    public static void main(String[] args) {

        /* task -> İlk 10 doğal sayının toplamını print eden code create ediniz.
         */

      int toplam=0;
       for(int i = 0; i <10; i++) {
           toplam=toplam+i;// toplam+=i
       }
        System.out.println(toplam);

    }
}
