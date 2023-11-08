package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task29 {


    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin. 3'ün üssü(kuvveti) ise true, değilse false döndürün.
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

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(kuvvetbulma(sayi));

    }

    private static boolean kuvvetbulma(int sayi) {
  int count =0;
       // if (sayi <= 0) {
         //   return false;
        //}
        //while (sayi % 3 == 0) {
          //  sayi /= 3;
            //count++;

        //}
        //System.out.println( " 3  üssü " +count);
        //return true;
   // }

        for(int i = 1; i < sayi; i++) {
            System.out.println(i);
            if(Math.pow(3,i)==sayi){

                return true;
            }

        }
        return false;



        }
    }

