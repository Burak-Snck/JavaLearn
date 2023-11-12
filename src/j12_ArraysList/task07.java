package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task07 {
    public static void main(String[] args) {
         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String [][] isimArr={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        yeniList(isimArr);

    }//main sonu

    private static void yeniList(String[][] isimArr) {
        List<String> list=new ArrayList<>();
        for (String[] w:isimArr) {
            System.out.println(Arrays.toString(w));
            for (int i = 0; i < w.length; i++) {
                list.add(w[i]);

            }
        }
        System.out.println("List " +list);
        Collections.sort(list);
        System.out.println("Sirali list "+list);
    }
}
