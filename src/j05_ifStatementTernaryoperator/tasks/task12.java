package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class task12 {
    public static void main(String[] args) {
          /*
        *Java ile gidilen kilometre verisine göre taksimetre tutarını  print eden code create ediniz.
        *Taksimetre kilometre başına 2.20 TL tutmaktadır.
        *Kısa mesafe tutarı 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
        Taksimetre açılış ücreti 10 TL'dir.
         */

        Scanner input=new Scanner (System.in);
        System.out.println("kilometre giriniz");
        double km=input.nextDouble();
        double taksimetre=km*2.20+10;
        if (taksimetre<=20){
            System.out.println("ödemeniz 20 tl");
        } else if (taksimetre>=21){
            System.out.println("ödemeniz" + taksimetre + " tl");
        }

    }
}
