package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task06 {
       /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>(Arrays.asList(5, 4, 3, 2, 1));
        System.out.println(hillNum(arrayList));

    }

    private static List<Integer> hillNum(ArrayList<Integer> arrayList) {
        List<Integer> list=new ArrayList<>();
        for (int i = 1; i < arrayList.size()-1 ; i++) {
            if (arrayList.get(i)<arrayList.get(i-1)&&arrayList.get(i)>arrayList.get(i+1)){
                list.add(arrayList.get(i));
            }
        }
        return list;
    }
}
