package j11_Arrays.tasks;

import java.util.Arrays;

public class task20 {
    public static void main(String[] args) {
        // Task-> verilen bir array'den istenmeyen elemanı silip  kalanlari
        // yeni bir array'a atayıp print eden METHOD create ediniz
        int[] arr = {3, 4, 2, 3, 5, 7, 3, 8, 5, 2, 4};
        int istenmeyenEleman = 3;
        istenenleriYazdir(arr,istenmeyenEleman);
    }

    private static void istenenleriYazdir(int[] arr, int istenmeyenEleman) {
        int istenmeyenSayisi=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==istenmeyenEleman){
                istenmeyenSayisi++;
            }
        }
        int[] yeniArr=new int[arr.length-istenmeyenSayisi];
        int index=0;
        for (int i = 0; i < arr.length; i++) {
            boolean shouldAdd=true;
            if (arr[i]==istenmeyenEleman){
                shouldAdd=false;
            }
            if(shouldAdd){
                yeniArr[index]=arr[i];
                index++;
            }
        }
        System.out.println("Eskisi="+Arrays.toString(arr));
        System.out.println("Yeni array= "+ Arrays.toString(yeniArr));
    }
}
