package j13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_FoorEachLoop {
    public static void main(String[] args) {

             /*
  for-each loop for loop'un gelişmiş halıdir.
  1. clean code- yazım kolaylığı
  2. code okuma kolaylıgı
  3. hata yapma riskini azaltır.
   */
        List<Integer> sayiList = new ArrayList<>(List.of(16, 21, 33, 54, 15, 45, 58));

        System.out.println("   ***   Task01   ***   ");
// Task01-> sayiList elemanlarını ayrı satırda print eden code create ediniz.


        System.out.println("****for i ");


        for (int i = 0; i < sayiList.size(); i++) {
            System.out.println("sayiList.get(i) = " + sayiList.get(i));
        }
        System.out.println("****for each");


        // data type daata name  :data source (collection-! Array Arraylist ,list)
        for (Integer avuc : sayiList) {

            System.out.println("avuc = " + avuc);

        }
//task02
        System.out.println("task222222222222222");
        for (Integer avuc2 : sayiList.subList(3, sayiList.size())) {
            System.out.println("(avuc2%2==1 ? avuc2: \"\") = " + (avuc2 % 2 == 1 ? avuc2 : ""));


        }

        System.out.println("task03333333333333");

        System.out.println("   ***   Task03   ***   ");
// task03-> sayiList  elemanlarını 2 ve 5 index(2,3,4,5) dahil
// toplamını print eden code create ediniz. sub ile yine

        int toplam=0;

    }

}

