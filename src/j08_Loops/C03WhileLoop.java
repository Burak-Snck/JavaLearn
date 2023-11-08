package j08_Loops;

import java.util.Scanner;

public class C03WhileLoop {
    public static void main(String[] args) {

        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var


        Scanner input = new Scanner(System.in);
        System.out.println( "bir sayı gir");
        int girilensayı=input.nextInt();

        int sayac=0;
        int tambolensayı=1;


        while (tambolensayı<=girilensayı ){
            if(girilensayı%tambolensayı==0){

                sayac++;
                System.out.println(tambolensayı);
            }

            tambolensayı++;
        }
        System.out.println("girilen "+  girilensayı +" "+ sayac+ " kadar tam böleni var");
    }
}
