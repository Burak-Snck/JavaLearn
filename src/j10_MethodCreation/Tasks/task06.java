package j10_MethodCreation.Tasks;

import java.util.Scanner;



public class task06 {

    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    int deger1 = input.nextInt();

    int deger2 = input.nextInt();

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz


        System.out.println("kare için 1\n üçgen için 2\n dikdörtgen için 3 seçiniz");
        int seçim = input.nextInt();



        switch (seçim) {

            case 1:
                değer();
                hesaplakare();


                break;
            case 2:
                hesaplaüçgen();
                break;


            case 3:
                hesapladikdortgen();
                break;


        }


    }//main sonu

    private static void hesaplaüçgen() {


    }

    private static void hesapladikdortgen() {
        System.out.println("1. değeri giriniz");
        int deger1 = input.nextInt();
        System.out.println("2. değeri giriniz");
        int deger2 = input.nextInt();
        System.out.println("alan : =" +(deger2*deger1));
    }



    private static void hesaplakare() {
        System.out.println();



değer();


    }

    private static int değer() {
        System.out.println("değer gir ilk");
        int deger1 = input.nextInt();
        System.out.println("değer gir ikinci");
        int deger2 = input.nextInt();
  return deger1;
    }


}
