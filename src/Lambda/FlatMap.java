package Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.stream.Stream;

public class FlatMap {

    /*
   Stream.flatMap, adıyla tahmin edilebileceği gibi, bir map ve flat işleminin birleşimidir. Bu, ilk önce elemanlarınıza bir
   fonksiyon uyguladığınız ve daha sonra düzleştirdiğiniz anlamına gelir.
   Stream.map yalnızca akışı düzleştirmeden bir işlevi uygular.
   Bir akışın düzleştirme'in neyi içerdiğini anlamak için, "iki seviye" olan [ [1,2,3],[4,5,6],[7,8,9] ] gibi bir yapı düşünün.
   Bunun düzleştirilmesi, "bir seviye" yapısında dönüştürülmesi anlamına gelir: [ 1,2,3,4,5,6,7,8,9 ].
   flatMap yöntemi, bir akışın her bir değerini başka bir akışla değiştirmenizi sağlar
   ve ardından oluşturulan tüm akışları tek bir akışa birleştirir.
 */


    public static void main(String[] args) throws IOException {
        Path Erişilecekdosya=Path.of("src/Lambda/HalUk");
        Stream<String> dosyaakışı= Files.lines(Erişilecekdosya);

//TASK 05 -> HalUk dosyasindaki farkli kelimeleri  print ediniz..
        System.out.println( "Task 0000000000000000005");


        Files.lines(Erişilecekdosya)
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(kelime -> System.out.print(kelime+ " "));


//TASK 06 -> HalUk dosyasindaki tum kelimeleri natural order  print ediniz..
        System.out.println();
        Files.lines(Erişilecekdosya)
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .sorted()
                .forEach(word -> System.out.print(word + " "));
        System.out.println("Task 07");

//TASK 07 -> HalUk dosyasinda "basari" kelimesinin kac kere gectigini buyuk harf kucuk harf bagımsız print ediniz.
        System.out.println(  Files.lines(Erişilecekdosya)
                .map(t->t.toLowerCase().split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.equals("basari"))//contains
                .count());

        System.out.println("Task 00008");

        //TASK 08 -> HalUk dosyasinda "a" harfi gecen kelimelerin sayisini print eden  programi create ediniz.

        System.out.println(  Files.lines(Erişilecekdosya)
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.contains("a"))//contains
                .count());

        System.out.println("Task 09");

        //TASK 09 -> HalUk dosyasinda icinde "a" harfi gecen kelimeleri print ediniz

       Files.lines(Erişilecekdosya)
                .map(t->t.split(" "))
                .flatMap(Arrays::stream)
                .filter(t->t.contains("a"))
               .forEach(kelime -> System.out.print(kelime+ " "));
        System.out.println( "Task 10");

        //TASK 10 -> HalUk dosyasinda kac /farklı harf kullanildigini print ediniz.

        System.out.println("TASK 10");
        System.out.println( Files.lines(Erişilecekdosya)
                .map(t->t.toLowerCase().replaceAll("\\W","").split(""))
                .flatMap(Arrays::stream)
                .distinct()
                .count());

        System.out.println("Task 000000011");
        //TASK 11 -> HalUk dosyasinda kac farkli kelime kullanildigini print ediniz.


        System.out.println(  Files.lines(Erişilecekdosya)
                .map(t->t.replaceAll("[^a-zA-Z ]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .count());
        System.out.println("eTask 00000012");
        //TASK 12 -> HalUk dosyasinda  farkli kelimeleri print ediniz.

        Files.lines(Erişilecekdosya)
                .map(t->t.replaceAll("[^a-zA-Z ]", "").split(" "))
                .flatMap(Arrays::stream)
                .distinct()
                .forEach(t-> System.out.print(t + " "));




    }


}
