package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task02 {

    public static void main(String[] args) {

        /* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */

        Scanner input=new Scanner(System.in);
        System.out.println( "cinsiyetiniz erkek ise 1 kadın ise 0");
        int cinsiyet=input.nextInt();



        if(cinsiyet==0 || cinsiyet==1)
            System.out.println("yaşınızı giriniz");
            int yaş=input.nextInt();
           if (cinsiyet==1){
              if (yaş<18){
                System.out.println("Erkek çocuk");
              }else{
                System.out.println("Adam");
              }

          }
           if (cinsiyet==0){
              if (yaş<18){
                System.out.println("Kız çocuk");
              }else{
                System.out.println("Kadın");
              }
          }

        else {
              System.out.println("güzel sayı gir");
          }



    }
}
