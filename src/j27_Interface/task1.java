package j27_Interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task1 {
    public static void main(String[] args) {
            /*
   1)Iterator'lar loop'larin yaptigi ayni isi yapar.
   2)Iterator'larda sonsuz loop olusma ihtimali yoktur.
   3)Iterator'lar ile loop'lar arasinda performans farki yoktur.
   4)Iterator'lar bir collection'dan eleman silme ve bir collection'daki elemani degistirme konusunda daha basrilidir.
   5)Iki tip iterator var; i)Iterator: Bu sadece eleman silmede kullanilir,
                                       eleman eklemek veya elemani degistirmek mumkun degildir.
                           ii)ListIterator:eleman silebilir(remove), ekleyebilir(add) ve degistirebilir(set).
                           Note:"Iterator" sadece soldan saga(ilk elemandan son elemana) calisir.
                                "ListIterator" ise iki yonlu calisabilir.
*/

        List<String > l1=new ArrayList<>(Arrays.asList("Feride","Sebnem","Sennur","Ayse","Merve","Ferhat","Burak"));

        System.out.println("l1 list ilk hali = " + l1);//[Feride, Sebnem, Sennur, Ayse, Merve, Ferhat, Burak]
        System.out.println("   ***   task01   ***   ");
//Task01-> l1 elemanlarını foor loop ile print eden code

        for (int i = 0; i < l1.size(); i++) {
            l1.set(i,l1.get(i)+ " :)");
            System.out.println(l1.get(i));
        }



    }
}
