package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class TASK05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
         Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */


        sırala();


    }//main sonu

    private static void sırala() {

        String[][] arr = {{"Ali", "Veli", "Ayse"}, {"Hasan", "Can"}, {"Suzan"}};
        ArrayList<String> list = new ArrayList<>();


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                list.add(arr[i][j]);

            }
        }



        Collections.sort(list);

        System.out.println(list);


    }


}
