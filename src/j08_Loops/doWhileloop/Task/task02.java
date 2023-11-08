package j08_Loops.doWhileloop.Task;

import java.util.Scanner;

public class task02 {
    public static void main(String[] args) {


  /*
  Task-> Girilen sayıyı 0 olmadıgı sürece girilen sayıların toplamını print eden code create ediniz.
   */
      Scanner input = new Scanner(System.in);
   int toplam=0;
   int sayı;
        do  {
            System.out.println("bir sayı giriniz : ");

             sayı = input.nextInt();
            toplam+=sayı;



        }while (sayı!=0);
        System.out.println("girilen sayıların toplamı : "+ toplam);







    }
}
