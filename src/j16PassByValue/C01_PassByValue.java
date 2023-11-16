package j16PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {


   /*
Java Pass By Value bir programlama dilidir.
Bir  primitive  variable  argument olarak
bir methoda call edildiğinde variable
değil bir copy clone (vesikalık) (pointer)
değeri gönderilir.

 */
// task -> verilen fiyat için %24 artırılmış
// fiyatı print eden METHOD  create ediniz.


        double fiyat=100;//double data type primitive variable
        System.out.println("method call öncesi fiyat  : " + fiyat);//100

        fiyatarttır(fiyat);//124

        System.out.println("method call sonrası fiyat  : " + fiyat);//100

    }

    private static void fiyatarttır(double fyt) {


        fyt*=1.24;
        System.out.println("artmış hali : " + fyt);
    }
}
