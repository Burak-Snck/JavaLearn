package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {
           /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.
​
         */


        Scanner input=new Scanner(System.in);
        List<Integer>list=new ArrayList();
        System.out.println("kaç öğrenci notu gireceksiniz");
        int adet= input.nextInt();
        int toplam=0;
        int ortalama=0;

       for(int i=0;i<adet;i++){

           System.out.println("öğrenci notu giriniz");
           int not=input.nextInt();
           toplam+=not;
           list.add(not);


       }
        System.out.println(list);
       System.out.println(ortalama=toplam/adet);
       int count =0;
        for (int k:list ) {
            if(k>ortalama){
              count++;

            }
        }
        System.out.println("ortalamayı geçen öğrenci sayısı = " +count);
    }
}



