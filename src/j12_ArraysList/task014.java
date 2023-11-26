package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class task014 {
    public static void main(String[] args) {

        // Task-> str'nin karakter saysını print eden code create ediniz.

        Scanner input =new Scanner(System.in);
        System.out.println("String bir ifade giriniz");
        String str=input.nextLine();
         String str1[]=str.split("");
        System.out.println(Arrays.toString(str1));
        System.out.println(str1.length);

         List <String>list=new ArrayList<>();
         for(int i=0; i<str.length(); i++) {

             list.add(str.substring(i, i+1));

         }
        System.out.println(list);
        System.out.println(list.size());

    }
}
