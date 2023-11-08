package j10_MethodCreation.Tasks;

import java.util.Scanner;



public class task05 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        System.out.println("1. sayı  giriniz");
        int sayı1=input.nextInt();
        System.out.println("2. sayı giriniz");
        int sayı2=input.nextInt();
        System.out.println("hangi işlemi yapacaksın");
        char işlem=input.next().charAt(0);


       dörtislem(işlem,sayı2,sayı1);

     //   System.out.println(toplam(sayı1,sayı2));


        System.out.println(toplam(sayı1,sayı2));


    }

    private static void dörtislem(char işlem, int sayı2, int sayı1) {

        switch (işlem) {

            case  '+':
               toplam(sayı2,sayı1);
                break;

            case '-':
               çıkarma(sayı1,sayı2);
                break;
            case 'x':
                System.out.println(sayı1+" x "+sayı2+" = "+(sayı1*sayı2));

                break;
            case '/':

                System.out.println(sayı1+" / "+sayı2+" = "+(sayı1/sayı2));
                break;

            default:
                System.out.println("hatalı işlem seçtiniz");


        }

    }

    private static void çıkarma(int sayı1,int sayı2) {
        System.out.println((sayı2 - sayı1));


    }


    private static int  toplam(int sayı1,int sayı2) {

        System.out.println(sayı1+" + "+sayı2+" = "+(sayı1+sayı2));
     return   sayı1+sayı2;
    }



}
