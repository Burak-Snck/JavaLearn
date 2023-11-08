package j11_Arrays.tasks;

import java.util.Arrays;

public class task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir METHOD create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
        int[] arr={1,2,-3,4,-5,-6};
        arrTersten(arr);
        System.out.println(Arrays.toString(arrTersten1(arr)));

    }

    private static int[] arrTersten1(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=1;
        }
        return arr;
    }

    private static void arrTersten(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]*=-1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
