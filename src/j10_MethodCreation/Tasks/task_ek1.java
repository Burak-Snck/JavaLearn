package j10_MethodCreation.Tasks;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;
 /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */

public class task_ek1 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        System.out.println("0-12 için 1 *** 13-24 için 2 *** 65 yaş üstü için 3 *** diğer için 4 e basınız ");
        int yas = input.nextInt();

        switch (yas) {

            case 1:


                hesaplaver1();

                break;

            case 2:
                hesaplaver2();
            case 3:
                hesaplaver3();
        }


    }

    private static void hesaplaver3() {
        System.out.println("hangi şehire gideceksiniz b için 1 *** c i.in 2 *** d i.in 3 ***");
        int yol = input.nextInt();

        double hesaplaver = 0;
        switch (yol) {
            case 1:
                System.out.println(hesaplaver = (500 * 0.10) * 0.7);
                break;
            case 2:

                System.out.println(hesaplaver = (700 * 0.10) * 0.7);
                break;
            case 3:
                System.out.println(hesaplaver = (900 * 0.10) * 0.7);
                break;
            default:
                System.out.println("hatalı giriş");
        }

    }

    private static void hesaplaver2() {
        System.out.println("hangi şehire gideceksiniz b için 1 *** c i.in 2 *** d i.in 3 ***");
        int yol = input.nextInt();
        System.out.println("geri döüş bileti alacaksanız 1'e *** almayacaksanız 2'ye basınız");
        int ekstra=input.nextInt();

        double hesaplaver = 0;
        switch (yol) {
            case 1:
                if (ekstra==2) {
                    System.out.println(hesaplaver = (500 * 0.10) * 0.9);
            }  else
                    System.out.println(((500*0.10)*0.9)*0.8);////burda çift bilet  için indirim
                break;
            case 2:

                System.out.println(hesaplaver = (700 * 0.10) * 0.9);
                break;
            case 3:
                System.out.println(hesaplaver = (900 * 0.10) * 0.9);
                break;
            default:
                System.out.println("hatalı giriş");
        }


    }

    private static void hesaplaver1() {

        System.out.println("hangi şehire gideceksiniz b için 1 *** c i.in 2 *** d i.in 3 ***");
        int yol = input.nextInt();

        double hesaplaver = 0;
        switch (yol) {
            case 1:
                System.out.println(hesaplaver = (500 * 0.10) * 0.5);
                break;
            case 2:

                System.out.println(hesaplaver = (700 * 0.10) * 0.5);
                break;
            case 3:
                System.out.println(hesaplaver = (900 * 0.10) * 0.5);
                break;
            default:
                System.out.println("hatalı giriş");
        }
    }


}

