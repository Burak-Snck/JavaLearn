package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class task17 {
    public static void main(String[] args) {


        // Task->  verilen bir listede tekrar eden sayilari sadece 1 kez print eden METHOD create ediniz
        // input : []
        // output [1, 3, 5, 6, 7]
        ArrayList<Integer>list = new ArrayList<>(List.of(1, 3, 5, 3, 5, 6, 1, 7));
        ArrayList<Integer>list2 = new ArrayList<>();
        for (int avuc:list) {
            if(!(list2.contains(avuc))) {
                list2.add(avuc);
            }
        }

        System.out.println(list2);
    }
}
