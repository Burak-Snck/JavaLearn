package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task25 {
    public static void main(String[] args) {


        //task-> girilen sayını faktoriyelini print eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("Enter a number:");
        int sayi=input.nextInt();

        faktoriyel(sayi);

    }

    private static void faktoriyel(int sayi) {
        int sonuç=1;
        for(int i=sayi ; i>=1 ; i--) {
            sonuç*=i;
        }
        System.out.println(sonuç);
    }
}
