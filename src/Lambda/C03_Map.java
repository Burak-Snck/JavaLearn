package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C03_Map {
    public static void main(String[] args) {


        List<Integer> sayılıst=new ArrayList<>(Arrays.asList(7,12,15,25,6,3,89,43,34,22,58,50,71,35));

          ///Task 01
      //  Map :Stream içerisinde erişilen her bir eleman üzerinde işlem yapmamıza
        //ve başka elemanlara dönüştürmemize imkan sağlayar

        // Task01-> listin çift elemanlarının karelerini aynı satıra aralarına bosluk bırakarak print eden code create ediniz.
        kareler(sayılıst);

        // Task02 : Functional Programming ile listin tek elemanlarinin  kuplerinin
        // bir fazlasini ayni satirda aralarina bosluk birakarak print eden code create ediniz.

        task2(sayılıst);

        // Task03-> Functional Programming ile listin cift elemanlarinin
        // karekoklerini ayni satirda aralarina bosluk birakarak print eden code create ediniz.
        karekok(sayılıst);

    }

    private static void karekok(List<Integer> sayılıst) {
        System.out.println("222222222222222222222222");
        sayılıst.stream().filter(SeedMethods::çiftmi).map((t)->(int)Math.sqrt(t)).forEach(SeedMethods::intprintet);
    }

    private static void task2(List<Integer> sayılıst) {

        sayılıst.stream().filter(SeedMethods::tekmi).map((t)->(int)Math.pow(t,3)+1).forEach(SeedMethods::intprintet);

        //((t)-> t*t*t+1)
    }

    private static void kareler(List<Integer> sayılıst) {


        sayılıst.stream().filter(SeedMethods::çiftmi).map((t)->(int)Math.pow(t,2)).forEach(SeedMethods::intprintet);
        sayılıst.stream().filter(SeedMethods::çiftmi).map(SeedMethods::kareal).forEach(SeedMethods::intprintet);
    }
}
