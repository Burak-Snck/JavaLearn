package Denemesayfası;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter gir");
        char krt = scan.nextLine().charAt(0);
        for (int i = 1; i <= 10; i++) {
            System.out.print((char) (krt + i) + " ");
        }
    }
}
