package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task17 {
    public static void main(String[] args) {

           /*
        Girilen String'in son karakterini silen code create ediniz...
         */
        Scanner input=new Scanner (System.in);
        System.out.println("bir ifade giriniz");
        String str1=input.nextLine();
        System.out.println(str1.replace(str1.substring(str1.length()-1)," "));

    }
}
