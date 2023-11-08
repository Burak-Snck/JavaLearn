package j07_StiringManipulation.tasks;

public class task12 {
    public static void main(String[] args) {
        /*  orange kelimesinden oluşan bir String oluşturun.
            String'in Apple'a eşit olup olmadığını doğrulayın. */

        //Kodu aşağıya yazınız.
        String str1="orange";
        System.out.println("str1.equals(\"   Apple\") = " + str1.equals("   Apple"));
        String meyve = "orange"; // orange kelimesinden oluşan bir String oluşturuldu

        // String'in "Apple" kelimesine eşit olup olmadığını kontrol et
        boolean esitMi = meyve.equals("Apple");

        // Sonucu ekrana yazdır
        System.out.println("String, 'Apple' kelimesine eşit mi? " + esitMi);
    }
}
