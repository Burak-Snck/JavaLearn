package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task15 {
    public static void main(String[] args) {
        Scanner input=new Scanner (System.in);
        System.out.println("sıcaklık giriniz");
        int x=input.nextInt();
        if (x<=5){
            System.out.println( "kayak yapasan");
        } if (x>5 && x<15){
            System.out.println("sinemaya git");
        }if (x>15 && x<25){
            System.out.println("piknik yapasan");
        }if (x>25){
            System.out.println("yüzmeye gidesen");
        }

    }
}
