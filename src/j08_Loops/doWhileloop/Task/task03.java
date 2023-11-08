package j08_Loops.doWhileloop.Task;

import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {

        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz

        //System.out.println("string gir");
        //String str=input.nextLine();
        //int i=0;

        //do{
         //   System.out.println(str.charAt(i));

        //}while (i<str.length()-1);
        //i++;
        Scanner input = new Scanner(System.in);


        char startchar;
        char endchar;

        System.out.println("bir character gir ");
        startchar=input.next().charAt(0);

        System.out.println("bitiş karakter gir");
        endchar=input.next().charAt(0);

         do {


             System.out.println(startchar +" ");
             startchar=(char) (startchar+1);


         }while (startchar<=endchar);





    }
}
