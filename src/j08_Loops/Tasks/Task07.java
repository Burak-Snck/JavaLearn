package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task07 {
    public static void main(String[] args) {
        /*
        Task ->
        girilen boyuttta bir kare için
         Ekran Çıktısı
            Bir sayı giriniz: 7
            1 0 0 0 0 0 0
            0 1 0 0 0 0 0
            0 0 1 0 0 0 0
            0 0 0 1 0 0 0
            0 0 0 0 1 0 0
            0 0 0 0 0 1 0
            0 0 0 0 0 0 1


            Bir sayi giriniz: 5
            1 0 0 0 0
            0 1 0 0 0
            0 0 1 0 0
            0 0 0 1 0
            0 0 0 0 1

            şekli print eden code create ediniz
         */

      Scanner input= new Scanner(System.in);
        System.out.println("boyut gir");
        int boyut = input.nextInt();

   for(int kat=1; kat<=boyut; kat++) {
       for(int daire=1; daire<=boyut; daire++) {
           System.out.print(kat==daire ? "1" : "0");
       }
       System.out.println();
   }












    }
}
