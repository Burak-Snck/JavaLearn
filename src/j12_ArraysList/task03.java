package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.


ArrayList<Integer>adet = new ArrayList<Integer>(Arrays.asList(1,3,6,78,94,23,54,4,89,343));



        Scanner scanner = new Scanner(System.in);
        System.out.println("hangi sayı kontol");
        int s = scanner.nextInt();
        for (int a:adet) {
            if( a==s) {
                System.out.println("istenen sayı listede var");
                break;

            }


        }

         System.out.println("listede yok");


    }
}
