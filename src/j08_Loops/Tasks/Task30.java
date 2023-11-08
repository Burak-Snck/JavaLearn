package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz

 Scanner input = new Scanner(System.in);
        System.out.println("1. sayı gir");
        int sayı1=input.nextInt();
        System.out.println("2. sayı gir");
        int sayı2=input.nextInt();
        int toplam=0;

        for(int i= (sayı1<sayı2 ? sayı1 : sayı2); i< (sayı1>sayı2 ? sayı1 : sayı2); i++) {
            toplam+=i;
            System.out.println(toplam);
        }




    }
}
