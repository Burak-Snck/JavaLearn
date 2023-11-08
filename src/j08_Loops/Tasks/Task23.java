package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");
        int  sayı= input.nextInt();
        int toplam=0;
        for(int i=0; i<=sayı; i++){ // girilen sayıya kadar loop tanımlandı
            toplam+=(i*i);  // loopddan gelen sayı karesi eklendi
        }
        System.out.println("girilenlerin karelar toplamı  :"+ toplam);


    }
}
