package j03_ScannerClass_TypeCasting;

public class C02_TypeCasting {
    public static void main(String[] args) {

        /*
        Type Casting: Bir numeric data type'ini diger numeric data type'ina cevirme işlemidir.
                      byte < short < int < long < float < double
        Note 1: Kucuk data type'ini buyuk data type'ine cevirmeye "Auto Widening" denir
        Note 2: Buyuk data type'ini kucuk data type'ine cevirmeye "Explicit Narrowing" denir.
 */
        // boolean basarılı=true;
        //String basari=basarılı;
        double sayı1 = 74;
        int sayı2 = 64;
        int sayı3 = 22;
        System.out.println("sayı2/sayı1 = " + sayı2 / sayı1);
        // 2 int bölündüğünde sonuç yine int

        byte b = 15;
        int num = b;

        int i=23;
        double m=i;
        System.out.println("m = " + m);

        double d2=13.56;
        int num2=(int) d2;
        System.out.println("num2 = " + num2);

    }
}
