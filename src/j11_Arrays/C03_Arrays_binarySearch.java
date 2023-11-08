package j11_Arrays;

import java.util.Arrays;

public class C03_Arrays_binarySearch {
    public static void main(String[] args) {
// Arrays.binarySearch(arr,value);-> girilen arraydeki istenen eleman kontrolu

        int sayiArr[] = {23, 44, 2, 11, 55, 60, 32, 34, 59, 22, 9, 64, 43};
        System.out.println("amele kod");
        int sayi1 = 44;
        int sayi2 = 20;
        boolean flag=false;
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] == sayi1) {
                flag=true;
                break;

            }

        }
        System.out.println( flag ? "aradığınız array de var: " : "aradığınız array de yok");

        System.out.println("****cincix kod****");
        Arrays.sort( sayiArr);//sortingen -->küçükten büyüğes sıralandı
        System.out.println(Arrays.toString(sayiArr));
        System.out.println("array de 20nin varlığı = " + Arrays.binarySearch(sayiArr,sayi2));
        System.out.println("array de 44ün varlığı = " + Arrays.binarySearch(sayiArr, sayi1));
    }
}
