package j07_StiringManipulation;

import java.util.Scanner;

public class C08_Trim {
    public static void main(String[] args) {
         /*
         trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

         */


        String str1="              selam ve debanlık            ";
        System.out.println(str1.length());
        System.out.println(str1.trim());
        System.out.println(str1); //o kkadar şey yaptık değişmedi String metot atama yapılmazsa kalıcı değişiklik yapmaz


    }
}
