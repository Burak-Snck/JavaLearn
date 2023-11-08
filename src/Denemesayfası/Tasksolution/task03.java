package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int sayi = input.nextInt();
        int counter = 0;
        while (sayi % 3 == 0) {
            sayi/=3;
            counter++;
            //System.out.println(counter);
        }
        System.out.println((counter != 0 && sayi==1) ?  " 3 ün  " + counter + ". Kuvvetidir\"" : "Degildir");
    }
}
