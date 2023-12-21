package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class C09_Skip {
// skip(n) => atlama demektir. Akışın ilk n elemanını attıktan sonra bu akışın kalan elemanlarından oluşan bir akış return eder.
// akıs n den daha az eleman içeriyorsa  skip(n) meth dan sonra boş akıs return eder.skip(n) ara işlemdir.

    public static void main(String[] args) {


        List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe", "bicibici", "büryan", "melemen", "cacix", "kokereç", "yağlama", "güveç", "arabAşı", "tantuni"));
        //List<String> yemahhh = new ArrayList<String>(Arrays.asList("küşleme", "küşleme", "küşleme", "soğanlı", "soğanlı", "soğanlı", "trileçe"));
        System.out.println("****Task01*****");

// Task : list elemanlarini son harfine göre siralayıp ilk iki eleman hariç kalan elemanlari print eden code create ediniz.

        ilkikiharic(yemahhh);
    }


    public static  void ilkikiharic(List<String> yemahhh){
        yemahhh.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1))).skip(2).forEach(SeedMethods::intprintet);


    }


}
