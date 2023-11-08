package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task10 {

    public static void main(String[] args) {
        /* 60 değerinde bir int oluşturun.
Eğer int 9'a bölününce kalan 0 ise ve 5'e bölününce kalan 0 ise "Able to divide by 9 and 5" yazdırın.
Eğer int 4'e bölününce kalan 0 ise ve 5'e bölünüce kalan 0 ise "Able to divide by 4 and 15" yazdırın.
*/

        Scanner input=new Scanner (System.in);
        System.out.println("bir sayı giriniz");
        int deger=input.nextInt();

        if (deger % 9 == 0){
            if (deger%5==0){
                System.out.println("Able to divide by 9 and 5");
            }
        } else if (deger%4==0) {
            if (deger%5==0){
                System.out.println("Able to divide by 4 and 15");
            }

        }else{
            System.out.println("ikiside değil");
        }


    }
}
