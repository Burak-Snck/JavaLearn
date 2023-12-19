package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class C04_Reduce {   /*
       /*
        reduce()-->azaltmak ... bir cok datayi tek bir dataya(max min carp top vs islemlerde) cevirmek icin kullanilir.
        kullanımı yaygındır pratiktir.
        Bir Stream içerisindeki verilerin teker teker işlenmesidir. Teker teker işleme sürecinde, bir önceki adımda elde edilen sonuç
        bir sonraki adıma girdi olarak sunulmaktadır. Bu sayede yığılımlı bir hesaplama süreci elde edilmiş olmaktadır.
        reduce metodu ilk parametrede identity değeri, ikinci parametrede ise BinaryOperator türünden bir obj kullanılır.
        reduce işleminde bir önceki hesaplanmış değer ile sıradaki değer bir işleme tabi tutulmaktadır.
        İşleme başlarken bir önceki değer olmadığı için bu değer identity parametresinde tanımlanmaktadır.
        */
    public static void main(String[] args) {
        List<Integer> sayiList = new ArrayList<>(Arrays.asList(7, 12, 15, 2, 5, 6, 3, 89, 43, 34, 22, 58, 50, 71, 35));
        System.out.println("****Task01*****");
        printCiftKareMax(sayiList);//Optional[3364]
        System.out.println("\n****Task02*****");
        System.out.println("Toplam : "+printElTopla(sayiList));
        printElTopla1(sayiList);
        System.out.println("\n****Task03*  ****");
        printElTopla2(sayiList);
        System.out.println("\n****Task04*****");
        printmintel(sayiList);
        System.out.println("task05// Task05-> List elemanlarının 58'den buyuk " +
                "en kucuk tek elemanını print eden code create ediniz...");

        printelsayı(sayiList);
        //list elemanlearının en küçüğünü
    }

    private static void printelsayı(List<Integer> sayiList) {
        System.out.println(sayiList.stream().filter((t)->t>58).filter(SeedMethods::tekmi).reduce(Math::min));
        System.out.println(sayiList.stream().filter((t)->t>58).filter(SeedMethods::tekmi).reduce(Integer::min));
    }

    public static void printmintel(List<Integer> sayiList) {
        //Aşaıda 4 yol var
        System.out.println(sayiList.stream().reduce(Math::min));
        System.out.println(sayiList.stream().reduce(Integer::min));
        System.out.println(sayiList.stream().reduce(SeedMethods::minbul));
        System.out.println(sayiList.stream().reduce(sayiList.get(0),(t,u)->t<u?t:u));
    }

    public static void printElTopla2(List<Integer> sayiList){
        System.out.println(sayiList.stream().filter(SeedMethods::çiftmi).reduce(1, (a, b) -> a * b));

    }

    //Task01-> list çift elemanlarının karelerinin en buyugunu print code create ediniz...
    private static void printCiftKareMax(List<Integer> sayiList) {
//        Optional<Integer> maxSayi =sayiList
//                .stream()
//                .filter(SeedMethods::ciftMi)
//                .map(SeedMethods::kareAl)
//                .reduce(Math::max);
//        System.out.println(maxSayi);
        System.out.println(sayiList
                .stream()
                .filter(SeedMethods::çiftmi)
                .map(SeedMethods::kareal)
                .reduce(Math::max));
    }

    //Task02-> list elemanlarının toplamını  print code create ediniz...
    public static Optional<Integer> printElTopla(List<Integer> sayiList){
        return sayiList
                .stream()
                //.reduce(Math::addExact);app. yavaslatir
                .reduce(Integer::sum);//specific data oldugu icin daha hizlidir
    }
    public static void printElTopla1(List<Integer> sayiList){
        System.out.println(sayiList
                .stream()
                //.reduce(Math::addExact);app. yavaslatir
                //.reduce(Integer::sum);//specific data oldugu icin daha hizlidir
                .reduce(0,(a,b)->a+b));//specific data old için app. hızlı çalışır.
    }
/*
a: ilk değerini her zaman  atanan identity değerden alır.
b: değerini her zaman Stream()'den alır
a: ilk değerden sonraki değerini action(işlem body)'den alır
  */
    //task03




}








