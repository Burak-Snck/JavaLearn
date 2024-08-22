package j07_StiringManipulation;

public class C12_replace_replaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        String str = "madem gelding dünyaya otor çalış JAVA'ya :) ";
        System.out.println("str = " + str);
        String eklemeli=str.replace("a", "*");
        System.out.println("eklemeli = " + eklemeli);
        System.out.println(str.replace("yaya", "para"));
        //char çalış

        System.out.println(str.replace("ü", "U"));
// silmek için
        System.out.println(str.replace(" :)", " "));



        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

        //(Regular Expressions)
//   \\s bosluk (
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler

        str= "javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";
        System.out.println(str.replaceAll("\\s", "*"));
        System.out.println(str.replaceAll("\\S", "*"));
        str.replaceAll("\\w", "*"); //harf ve rakamları yıldız yaptı diğerlerine dokunmadı
        System.out.println(str.replaceAll("\\d", "*"));
        String a ="FERHAT";
        System.out.println(a.substring(0,1).toUpperCase() + a.substring(1).toLowerCase());


    }
}
