package j02_DataTypes_WrapperClass;

public class C03_cocatenation {

    public static void main(String[] args) {

        /*
     Not: char variable'lari matematiksel islemlerde   ASCII degerleri kullanir.
          Ornegin; System.out.println('A' + 'C'); ekrana AC yerine 132 print eder.
     Note: Java'da "+" sembolunun
             i)Toplama islemi
             ii)Birlestirme Islemi(Concatenation)
           Java "+" sembolu  once toplama yapmaya calisir, yapamazsa birlestirme islemi yapılır aksi halde CTE verir.
  */
        int a = 17;

        int b = 61;
        String ad = "burak";
        String soyad = "kucuk";
        System.out.println(ad+soyad+a+b);//
        System.out.println(a+ad+soyad+b);//
        System.out.println(a+b+ad+soyad);//
        System.out.println(a+b);//
        System.out.println(" "+a+b);//
        System.out.println(ad+soyad+(a+b));//
        System.out.println((a+b)+ad+soyad);//
        System.out.println(ad+(a-b)+(a+b));//
        System.out.println(ad+((a-b)+(a+b)));//

    }

}
