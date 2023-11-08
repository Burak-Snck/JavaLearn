package j07_StiringManipulation;

public class C01_Concatenation {

    public static void main(String[] args) {
        /*
concat() -> methodu içinde parametre alığı String variable'yi çalşıtığı string sonuna ekler(birleştirir)
Java '+' işleminde en az bir string ifade vars artimetik toplama değil birleştirme yapılır
 */

        String qa = "sebnem";
        String teamlead="feride";

        System.out.println(qa.concat(teamlead));
        /*
Ahan da TRICK-> String meth vcariable'da kalıcı değil geçici değişklik yapar.
String variabvle kalıcı değişklik yapmak için atama(=) yapılmalı
 */
        System.out.println(qa + teamlead);


        System.out.println(teamlead.concat(23+"&"));
        System.out.println(qa.concat(100+ ""));
        System.out.println(qa.concat(String.valueOf(true)));


    }
}
