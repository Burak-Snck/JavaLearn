package Denemesayfası.challenge05.challenge07;

import java.util.Scanner;

public class Task05 {
    // Bir metindeki en uzun kelimeyi bulan bir metot create ediniz

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String metin = scan.nextLine();
        String[] gorev = metin.split("\\s ");
        System.out.println(gorev);


    }


}


