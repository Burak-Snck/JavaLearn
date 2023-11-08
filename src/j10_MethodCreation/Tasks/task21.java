package j10_MethodCreation.Tasks;

import java.util.Scanner;
  /*
    task-> girilen bir tamsayının basamak sayısını print eden METHOD create ediniz.
    */



public class task21 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("sayı giriniz");
      int sayı= input.nextInt();
        gorev(sayı);
    }

    private static void gorev(int sayı) {
        int count=0;
        while ((sayı>10)){
            sayı/=10;
            count++;
        }


        System.out.println(count+1);
    }
}
