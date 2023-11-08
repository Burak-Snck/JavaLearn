package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task21 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("3 kelime giriniz");
        String str1 = input.nextLine();
      String str = str1.toUpperCase();

     char ilkad=str.charAt(0);
     char ikinciad=str.substring(str.indexOf(" ")+1).charAt(0);



    }
}
