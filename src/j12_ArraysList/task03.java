package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.





        ArrayList<Integer> sayiList=new ArrayList<>(Arrays.asList(1,3,6,78,94,23,54,4,89,34));
        Scanner input=new Scanner(System.in);
        System.out.println("aranacak sayı giriniz ");
        int aranacak=input.nextInt();


        System.out.println(sayiList.contains(aranacak) ? "aranan sayi listte mevcut" : "aranan sayı listte mevcut değil");



    }
}
