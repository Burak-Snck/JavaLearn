package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class task0004 {
    public static void main(String[] args) {
        /* TASK :
​
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> arrlist = new ArrayList<String>(Arrays.asList("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list2 = new ArrayList<>();
        for (int i = 0; i < arrlist.size(); i++) {


            if (!(arrlist.get(i).contains("a") || arrlist.get(i).contains("A"))) {
                list2.add(arrlist.get(i));

            }


        }
        System.out.println(list2);

    }
}
