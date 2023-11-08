package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task01 {
    // task-> Girilen sayıların toplamı 333'ü geçtiğinde girilen sayı adetini ve toplamını print eden code create edinz


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int count = 0;

        while (toplam <= 333) {

            System.out.println("sayı gir");
            int sayı = input.nextInt();
            count++;
            toplam += sayı;



        }
        System.out.println(toplam);
        System.out.println(count);

    }
}
