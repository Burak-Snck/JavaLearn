package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class tasks09 {
    public static void main(String[] args) {




        /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */


        Scanner scan = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz");

        int number = scan.nextInt();



        if (number == 0) {
            System.out.println("Im neutral");
        } if (number >0 ) {
            System.out.println("I m positive");
        }else{
            System.out.println("I am negative");
        }
    }
}
