package j05_ifStatementTernaryoperator;

import java.util.Scanner;

public class C02_if_elseStatemennt {


    public static void main(String[] args) {
         // girilen sayının 18 den büyüklüğünü kontrol eden code dcreate ediniz


        Scanner input =new Scanner (System.in);
        System.out.println("sayı gir");
        int sayı=input.nextInt();
          if (sayı>18)
          {
              System.out.println("yaş büyük");

          }else {
              System.out.println("büyüde gel");
          }






    }
}

