package j11_Arrays.tasks;

import java.util.Arrays;

public class task22 {
    public static void main(String[] args) {
        /* task->
         * verilen  {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini için
         *  2D arrayinden min number print den code create ediniz.
         */

        int arr[][] = {{10, 2, 3}, {2, 34, 1}, {-51, 5, 5}, {2, -1}};
        int minNumber = arr[0][0];
        for (int[] w : arr) {
            System.out.println(Arrays.toString(w));
            for (int e : w) {

                if (e < minNumber) {
                    minNumber = e;
                }
            }
        }
        System.out.println("minNumber = " + minNumber);
    }
}


