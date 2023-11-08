package j07_StiringManipulation;

public class C13_ValueOf_parse {
    public static void main(String[] args) {


        /*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String b1="10000";
        String b2="12000";
        System.out.println(b1.concat(b2));
       int  yenib1= Integer.valueOf(b1);     // string olan b1 int data type atandı
       int  yenib2= Integer.valueOf(b2);
        System.out.println(yenib1+yenib2);


        int tc=12345566;
      String strtc = String.valueOf(tc);
        System.out.println(tc+ strtc);

          /*
Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
   output: strA+strB=31.54
     */
        String strA="$13.99";
        String strB="$17.55";
       // double  stra= Double.valueOf(strA.substring(1));
        // double  strb= Double.valueOf(strB.substring(1));
        double  stra= Double.valueOf(strA.replaceAll("\\D",""));
        double  strb= Double.valueOf(strB.replaceAll("\\D",""));

        System.out.println((stra+strb)/100);

/*
Integer.valueOf() ile Integer.parseInt() metotları arasında temel fark
valueOf() metodu Integer tipinde bir obj, parseInt() metodu ise int tipinde bir veri tipi döndürür.
parseInt() metodu primitive veri tipi döndürdüğü için daha hızlı çalışır.
 */











    }
}
