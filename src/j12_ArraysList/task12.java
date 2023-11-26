package j12_ArraysList;

import java.sql.Array;
import java.util.ArrayList;
import java.util.List;

public class task12 {
    public static void main(String[] args) {

        /* TASK :
         * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
         * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
         * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
         */


        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        int toplam = 0;

        List<Integer> arrlist = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
            if (i == 0 || i == 2 || i == 5 || i == 9) {
                arrlist.add(toplam);
                toplam = 0;
            }

        }
        System.out.println(arrlist);
    }
}





