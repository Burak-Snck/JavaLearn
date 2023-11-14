package interviewQuestions01;

import java.util.Arrays;
import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray {
   /*
     Kullanicidan bir String aliniz.
     String'de var olan her character'in sayisini ekrana yazdiriniz.
     Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
            abaa   ==> a=3  b=1
    */
   public static void main(String[] args) {

Scanner input=new Scanner (System.in);
      System.out.println(  "bir metin git");
      String  str=input.nextLine();
      String arr[]=str.split("");
      System.out.println(Arrays.toString(arr));

      String output="";
      for(int i=0; i<arr.length; i++){
         int  count=0;
         for(int j=0; j<arr.length; j++){
            if(arr[i].equals(arr[j])){
             count++;
            }
         }
         if(output.contains(arr[i])){
           output+=arr[i]+"="+count+" ,";
         }
      }
       System.out.println(output);
   }
}
