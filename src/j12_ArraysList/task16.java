package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class task16 {
    public static void main(String[] args) {


        /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.

    Örnek1:
    Input: [1,2,3,1]
    Output: true
​
    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
        ArrayList<Integer> arrList = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 3));

        System.out.println(dupiccate(arrList));

    }

    private static boolean dupiccate(ArrayList<Integer> arrList) {
        boolean l = false;
        for (int k = 0; k < 4; k++) {
            for (int i = 0; i < arrList.size(); i++) {

                if (arrList.get(k).equals(arrList.get(i))) {
                    l = true;
                }
            }
        }
        return l;
    }


}




