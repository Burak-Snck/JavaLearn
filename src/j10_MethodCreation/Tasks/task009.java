package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task009 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        int saat = input.nextInt();

        ceviri(saat);


    }

    private static void ceviri(int saat) {

        System.out.println("saat*3600 = " + saat * 3600);

    }


}
