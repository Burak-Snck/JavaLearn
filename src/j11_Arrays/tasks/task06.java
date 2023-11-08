package j11_Arrays.tasks;

import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        int arr[] = {21, 52, 14, 63, 49, 31, 35, 53, 26};
        siralama(arr);
    }

    private static void siralama(int[] arr) {
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        int k =0;
      int yeniarrr[]=new int[arr.length];
        for(int i=arr.length-1; i>=0; i--){
            System.out.println(arr[i]);
            yeniarrr[k]=arr[i];
            k++;
        }
        System.out.println(Arrays.toString(yeniarrr));

    }
}
