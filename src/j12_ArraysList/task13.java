package j12_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};
        System.out.println(ardisikTopla(arr));

    } // main sonu

    private static List<Integer> ardisikTopla(int[] arr) {
        List<Integer> toplananSayilar=new ArrayList<>();
        int count=0;
        int toplananSayiAdedi=1;
        while ((arr.length-toplananSayiAdedi)>=count){
            int toplam=0;
            for (int i = 0; i <=count ; i++) {
                toplam+=arr[toplananSayiAdedi-1+i];
            }
            count++;
            toplananSayiAdedi+=count;
            toplananSayilar.add(toplam);
        }
        return toplananSayilar;
    }
}
