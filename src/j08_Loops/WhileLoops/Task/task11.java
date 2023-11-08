package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int başla = 1;
        int ebyssayı = 0;
        while (başla <= 5) {

            System.out.println("sayı gir");
            int sayı = input.nextInt();
            ebyssayı = Math.max(ebyssayı, sayı); // girilen ile eldek i sayıyı karşılaştırır
            başla++;
        }

        System.out.println(ebyssayı);
    }
}
