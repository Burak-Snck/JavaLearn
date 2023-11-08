package j07_StiringManipulation;

public class C02_Length {

    public static void main(String[] args) {

        /*
length() methodu girilen string'in uzunluğunu:içinde bulunan karakter sayısını return(döndurur :verir ) eder
butun karakterleri(boşluk vs) sayıp adedini verir.
 */
  String str1="karaca dan hediye";
  System.out.println(str1.length());
        /*
Trick-> null atanan String variable her hangi bir meth call etmez .
nul-> case sensitive NULL !=null !=Null
null-> dutluk: arsa değeri olmayan arazisadece hiçiliği gösteren pointer(işaretçi)
 */

        String str5; // tanımlanmış ama atanmamış(assaigment)
       // System.out.println("str5= " + str5); //CTE HATASI
       // System.out.println("str5.length()= " + str5.length()); //CTE HATASI

    }
}
