package j08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("sayı gir");
        int sayı = input.nextInt();

        int bolensayı = 0; // boş kutu
        for (int i = 2; i < sayı; i++) {  // girilen say nın  -1 ine kadar loop tanımlandı
            //if(sayı%i == 0) { // sayı loopdan gelen sayıya tam bölünme şartı
            bolensayı = (sayı % i == 0) ? bolensayı++ : bolensayı;
            //  bolensayı++;
        }
        System.out.println(bolensayı == 0 ? "asal" : "asal değil");
    }


}

