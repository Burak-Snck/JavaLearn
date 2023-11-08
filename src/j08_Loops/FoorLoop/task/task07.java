package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {


         /*
    task-> Girilen bir tamsayının  3 üssü olup olmadığını kontrol eden code create ediniz.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true
​
        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true
​
        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */


        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz: ");
        int sayi = input.nextInt();
        int counter = 0;
        while (sayi % 3 == 0) {
            sayi /= 3;
            counter++;
            //System.out.println(counter);
        }
        System.out.println((counter != 0 && sayi == 1) ? " 3 un " + counter + ". Kuvvetidir" : "Degildir");


    }


}


