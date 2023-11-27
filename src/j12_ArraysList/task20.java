package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task20 {
        /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
        
     */
        public static void main(String[] args) {

            ArrayList<Integer>list=new ArrayList<Integer>((Arrays.asList(5,3,4,6,7)));
            System.out.println(secondMax(list));

        }

    private static int secondMax(ArrayList<Integer> list) {
        Collections.sort(list);
        int result=list.get(list.size()-2);
            return result;
    }

}
