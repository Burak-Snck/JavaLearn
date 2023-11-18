package projeler;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class tas_kağıt_makas2 {
    static Scanner scan = new Scanner (System.in);
    static  int bilgisayarPuan = 0;
    static int oyuncuPuan = 0;

    public static void main(String[] args) {

        String oyuncuSecim = "E";
        while (oyuncuSecim.equals("E")) {
            System.out.println("Lutfen seciminizi yapiniz \n " +
                    "tas, makas, kagit \n" + "OYUNCU :::  ");
            oyuncuSecim= scan.nextLine();

            Random rnd = new Random();
            List<String> secenek = new ArrayList<>(List.of ("Tas", "Kagit", "Makas"));
            int randomIndex = rnd.nextInt(secenek.size());
            String randomScm = secenek.get(randomIndex).toLowerCase();
            System.out.println("BILGISAYAAR :::\n " + randomScm);

            if (randomScm.equals(oyuncuSecim)) {
                System.out.println("Berabere !!!");
            } else if ((randomScm.equals("tas")  && oyuncuSecim .equals("makas"))
                    ||( randomScm.equals("makas")  && oyuncuSecim.equals("kagit"))
                    || (randomScm.equals("kagit")  && oyuncuSecim.equals("tas"))) {
                bilgisayarPuan++;
            } else {
                oyuncuPuan++;
            }
            System.out.println("Oyuna devam etmek icin \n" +
                    "E \n" +
                    "basin....");
            oyuncuSecim= scan.nextLine().toUpperCase();
        }

        System.out.println("Kazanan :" + ( oyuncuPuan < bilgisayarPuan ? "Bigisayar kazandi" : "Oyuncu kazandi"));
        System.out.println("Oyuncu :"+oyuncuPuan +"\n" +
                "Bilgisayar :"+bilgisayarPuan);

    }
}
