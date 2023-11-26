package j12_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task0011 {
    public static void main(String[] args) {


           /* Task->
    Girilen bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */


        Scanner input = new Scanner(System.in);
        System.out.println("tam sayı giriniz");
        int sayi = input.nextInt();
        List<Integer> fibonacci = new ArrayList<>();
        fibonacci.add(1);
        fibonacci.add(1);
       for(int i=0; i< sayi; i++){

           int yeniSayi = fibonacci.get(i) + fibonacci.get(i + 1);
           fibonacci.add(yeniSayi);
           if (yeniSayi > sayi) {
               break;
          }

       }
        System.out.println(fibonacci);


    }
}
