package Denemesayfası;

import java.util.Scanner;

public class deneme2 {
    public static void main(String[] args) {



        Scanner input = new Scanner(System.in);
        System.out.println("Ehliyetiniz var ise Evet yoksa Hayir giriniz.");
        Character ehliyetVarligi = input.next().charAt(0);
        if (ehliyetVarligi.charValue() == 'e' || ehliyetVarligi.charValue() == 'E') {
            System.out.println("Tecrube yilinizi giriniz");
            int tecrubeYili = input.nextInt();
            if (tecrubeYili >= 7) {
                System.out.println("Lutfen km giriniz");
                int km = input.nextInt();
                if (km >= 100000) {
                    System.out.println("Arabayi almaya hak kazandiniz....");
                } else {
                    System.out.println("Arabayi almak icin " + (100000 - km) + " km ye daha ihtiyaciniz var");
                }
            } else {
                System.out.println("Arabayi almak icin " + (7 - tecrubeYili) + " yil daha tecrubeye ihtiyaciniz var.");
            }
        } else if (ehliyetVarligi.charValue() == 'h' || ehliyetVarligi.charValue() == 'H') {
            System.out.println("Uzgunuz ehliyetiniz olmadigi icin arabayi alamazsiniz.");
        } else {
            System.out.println("Lutfen sadece \"EVET\" yada \"HAYIR\" giriniz");
        }
    }
}
