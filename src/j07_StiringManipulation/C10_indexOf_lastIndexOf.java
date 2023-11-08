package j07_StiringManipulation;


import java.util.Scanner;

public class C10_indexOf_lastIndexOf {
    public static void main(String[] args) {




/* indexOf() arana yolcunun koltuk numarası
   char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
   Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
   contains den farkı indexini verir, contains ise true false
 */


        String str = "madem geldin dünyaya otur çalış JAVA'ya :)";
        System.out.println(str.indexOf(':' ));
        System.out.println(str.indexOf("java")); //  olmayan char ve Stirng için -1 verir
        System.out.println(str.indexOf("JAVA"));
        //birden fazla char ve String varssa soldaki ilki return eder
        System.out.println(str.indexOf("d", 12));
        /* lastIndexOf()
 String içinde aranan karakter(ler)in sondan itibaren ilk indexini verır
 indexOf un sondan olan hali fakat index numaraları değişmez.
 lastIndexOf() Method'u index'i sorulan character'in son gorunumunun index'ini return eder.
 indexOf() methodunda birden fazla character'in index'i sorulursa ilk character'in index'i return edilir.
 */

        System.out.println("str.lastIndexOf(\"a\") = " + str.lastIndexOf("a"));//sondan ilk görünen a nın indeksi
        System.out.println("str.lastIndexOf(\"x\") = " + str.lastIndexOf("x"));// olmayan karakter char veya Str -1 basar
        System.out.println("str.lastIndexOf(')') = " + str.lastIndexOf(')'));



        /* Task-> girilen bir string ifadenin aşağıdaki şartları sağlamasını kontrol eden code create ediniz
a-) girilen ifade java içermiyor
b-) girilen ifade 1 adet java içeriyor
c-) girilen ifade  1'den çok java içeriyor
 */
        Scanner input = new Scanner (System.in);

        System.out.println("bir metin giriniz");
        String str1 = input.nextLine();
        if (str1.indexOf("java")==-1){
            System.out.println("java içermez");
        }else if ( str1.indexOf("java")==str1.lastIndexOf("java") ){
            System.out.println("sadece 1 tane java var");
        }else {
            System.out.println("en az 2 java var");

        }


    }
}
