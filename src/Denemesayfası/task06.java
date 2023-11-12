package Denemesayfası;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir karakter gir");
        int k;
        char krt = scan.nextLine().charAt(0);
        for (int i = 1; i <= 10; i++) {
            k=i;
            System.out.print(k);
            System.out.print((char) (krt + i) + " ");
        }
    }
}
