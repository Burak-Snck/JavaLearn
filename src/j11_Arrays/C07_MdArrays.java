package j11_Arrays;

import java.util.Arrays;

public class C07_MdArrays {
    public static void main(String[] args) {
  /*
		Çok Boyutlu Diziler
        Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
         Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
         formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
         matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
         satır ve sütun sayısını girmemiz yeterli olacaktır.
        * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
        Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.
​
		 * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
		 *  icerdeki  array'lere  inner->Daire array denir
		 * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
		 *  Array'i ancak tum elemenlari atanarak declare edilmeli
		 * 3- Multi dimensional array'de bir elemanin indexi icin
		 *  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
		 */
        // MdArrays declaration...
        int arr1[][] = new int[3][5];// 3 kat ve herkatta 5 daire depolayan 2 boyutlu boş array tanımlandı
        // minicik taskcıkkk-> bir okul için 7 sınıfı ve 24 er öğrencisi olan bir arra tanımlanyın...

        //                  [outer]    [inner]
        int okul[][] = new int[7][24];

        //MdArray eleman atama
        arr1[2][3] = 67;
        arr1[1][0] = 66;
        // arr1[5][7]=66;// RTE out bound
        // MdArray print etme
        System.out.println("arr1[2][3] = " + arr1[2][3]);//67
        System.out.println("arr1[1][0] = " + arr1[1][0]);//66
        // System.out.println("arr1[5][7] = " + arr1[5][7]);//RTE->ArrayIndexOutOfBoundsException
        System.out.println("arr1[1][3] = " + arr1[1][3]);// 0 -> atama yapılmayan arr için data type göre default değer atanır
        int arr2[][] = {
                {12, 15},// 0. kat 2 daireli
                {123, 345, 567},// 1. kat 3 daireli
                {1001},// 2.kat 1 daireli
        };
        System.out.println("Arrays.toString(arr2) = " + Arrays.toString(arr2));//[[I@6bf256fa, [I@6cd8737, [I@22f71333]
        /*
        toString(mdArr);-> inner array'lerin ref değerini print eder..
        toString(mdArr);-> outer(dış) arr Stringe cevirir
        outer arr elemanları da print etmek içindeeptoString(arr) kullanılmalı
         */

        System.out.println("Arrays.deepToString(arr2) = " + Arrays.deepToString(arr2));// [[12, 15], [123, 345, 567], [1001]]
        System.out.println("Arrays.toString(arr2[2]) = " + Arrays.toString(arr2[2]));//[1001]
        System.out.println("Arrays.toString(arr2[1]) = " + Arrays.toString(arr2[1]));//[123, 345, 567]
        System.out.println("Arrays.toString(arr2[0]) = " + Arrays.toString(arr2[0]));// [12, 15]

    }

    /*
 Çok Boyutlu Diziler
       Java'da Çok Boyutlu Diziler varsayılan bir veri tipi olarak bulunmazlar ve matris olarak adlandırılırlar.
        Dizilerin 2 boyutlu halleri şeklinde tanımlanırlar. Matrisler satır ve sütun şeklinde tablo verisi
        formatındaki verileri tutmak için kullanılır. Diziler liste halinde veriler için uygunken,
        matrisler tablo şeklindeki veriler için uygundur. Oluşturulan tabloda bir değere ulaşmak istersek
        satır ve sütun sayısını girmemiz yeterli olacaktır.
       * TRICK :)İki boyutlu dizilerde tek boyutlu diziler gibi indis değeri 0'dan başlar.
       Dizide tutulacak veri tipleri aynı olmak zorundadır farklı veri tiplerini aynı matriste tutamayız.

  * 1- Ic Icice olusturulan  array'lerde   disardaki ana array'e outer-> Kat  array
  *  icerdeki  array'lere  inner->Daire array denir
  * 2- TRICK->  icerdeki array'lerin boyutlari birbirinden farkli ise
  *  Array'i ancak tum elemenlari atanarak declare edilmeli
  * 3- Multi dimensional array'de bir elemanin indexi icin
  *  en distaki array haric, elemana kadar ic ice olan tum arraylerin indexlerini yazmak gerekir
  */
// MdArrays declaration...
    int arr1[][] = new int[3][5];// 3 kat ve herkatta 5 daire depolayan 2 boyutlu boş array tanımlandı
    // minick taskcıkkk-> bir okul için 7 sınıfı ve 24 er öğrencisi olan bir arra tanımlanyın
    int okul[][] = new int[7][24];


}

