package j11_Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class C01_Arrays {
    /*
Array (Dizi): Java'da birden fazla aynı type variable depolamak (store etmek) icin kullanilan bir objedir.
Array tanımlamak için:
1- data type (Bir array'in icerisinde sadece ayni data tipinden variable olmalıdır.)
2- length (length array'e depolanacak  max eleman sayisini belirtir ve length'den  fazla eleman  koyulursa RTE verir)

 Array'de primitive datalar veya non-primitive datalarin referanslari store edilebilir
 isimler array'inin icinde isim degerleri degil, isimlerin referanslari saklanır
 */
    public static void main(String[] args) {
        int a;// declare edilen ama atama olmayan primitive ilkel veriable
        int arr[];  // non primitive
        //trick   *** tanımlanan ancak atanmayan bir array herhangi bir actiona alınırsa cte veriri
        String isimArr []={"muhammed","ayşe","musa","şennur"};//hem decleration hem de assaigment edilen string data type array tanımlandı
        int sayiArr[]=new int [5];// eleman sayısı declare edilen boş int data type array
        sayiArr [3]=61;
        sayiArr[4]=54;


        //length

        System.out.println(isimArr.length);
        System.out.println("sayiArr.length = " + sayiArr.length);



        System.out.println("sayiArr = " + sayiArr);
        // sout(arr)Array non primitive old için (obj)referans değeri print eder ..
        //Arrays.toString( arr)ile array elemanları print eder
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(isimArr));
        System.out.println("Arrays.toString(sayiArr) = " + Arrays.toString(sayiArr));

       // *****
        // Array da son indeks? arr[arr.length -1]



        System.out.println("sayiArr[sayiArr.length - 1] = " + sayiArr[sayiArr.length - 1]);
        //Array ilk indeks eleman  arr[0]
        System.out.println("sayiArr[0] = " + sayiArr[0]);

     // Array olmayan indeks eleman
        System.out.println("sayiArr[99] = " + sayiArr[99]);//RTE verir
        // Array elemanlarını yazdırm  bad practise
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));//burda yine array verir ama aşağıda farklı
        for(int i=0; i<isimArr.length;i++ ){// arr eleman sayısı kadar tekrar
            System.out.println(isimArr[i]+" ");//tekrardam alınan her bir elemanı print eder

        }
        System.out.println();
        //Array eleman natural ording (doğal sıralama)
        //alphabetic a-z numeric ascendig k-b
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));
        Arrays.sort(isimArr);
        System.out.println("Arrays.toString(isimArr) = " + Arrays.toString(isimArr));

    }
//Array declaration

}
