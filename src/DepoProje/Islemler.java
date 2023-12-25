package DepoProje;

import java.util.Map;
import java.util.Scanner;

public class Islemler extends Urunler{


    static String c_CYAN = "\u001B[36m";
    static String c_RED = "\u001B[31m";
    static String c_PURPLE = "\u001B[35m";
    static String c_RESET = "\u001B[0m";
    static String BOLD = "\033[0;1m";
    static String c_GREEN = "\u001B[32m";
  static int ıd=1003;
    static Scanner scan = new Scanner(System.in);

    public void yetkili() {
        System.out.println("Yetkili İşlem Menüsü");

        System.out.println("Ürün Tanımlama 1 ");
        System.out.println("Ürün Listeleme  2 ");
        System.out.println("Ürün Girişi 3");
        System.out.println("Ürünü Rafa Koy 4");
        System.out.println("Ürün Çıkışı 5 ");
        System.out.println("Çıkış 6 ");


        System.out.print("\tSeçiminiz : " + c_RESET);
        int secim = TryCatch.intGirisi();
        try {
            switch (secim) {
                case 1:
                    uruntanımlama();
                  yetkili();

                    break;
                case 2:
                    urunlisteleme();


                    break;
                case 3:
                    urungirisi();
                    yetkili();
                    break;
                case 4:
                    rafakoy();
                    yetkili();
                    break;
                case 5:
                    urunçıkışı();
                    yetkili();
                    break;
                case 6:
                    çıkış();


                    break;
                case 7:

                default:
                    System.out.println(BOLD + c_RED + "****Hatali giris. Yeniden deneyiniz*****" + c_RESET);
                    yetkili();
                    break;


            }
        } catch (Exception e) {
            System.out.println(c_RED + "****Hatali Giris*****" + c_RESET);
        }


    }

    private void çıkış() {
        try {
            System.out.print("Çıkış Yapılıyor ----İyi günler");

            for (int i = 0; i < 3; i++) {
                Thread.sleep(1000);
                System.out.print(".");
            }

            System.out.println();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void urunçıkışı() {

        System.out.println("Çıkarmak İstediğiniz Ürün ID gir");
        int seçim=TryCatch.intGirisi();

       if(Urunler.depodakiürünler.containsKey(seçim)){
          Urunler silinen= Urunler.depodakiürünler.remove(seçim);
           System.out.println(silinen + c_RED+" SİLİNDİ "+c_RESET);
       }else {
           System.out.println("Belirtilen anahtar değeri bulunamadı.");
       }


    }

    private void rafakoy() {



    }

    private void urungirisi() {
        System.out.println();
        System.out.println( "Ürün ismini giriniz : ");
        String isim=TryCatch.stringGirisi();
        System.out.println("Üretici Giriniz : ");
        String  üretici =TryCatch.stringGirisi();
        System.out.println("Miktarı Giriniz : ");
        int miktar=TryCatch.intGirisi();
        System.out.println("BirimGiriniz : ");
        String birim=TryCatch.stringGirisi();
        System.out.println("Raf Giriniz : ");
        String raf=TryCatch.stringGirisi();
        Urunler urunler=new Urunler(  isim,  üretici, miktar,  birim,  raf);
        Urunler.depodakiürünler.put(ıd,urunler);
      ıd++;



    }






    public void urunlisteleme() {
        System.out.printf(BOLD + c_CYAN + "%-20s%-20s%-10s%-15s%-10s%-10s", "ID", "İsim", "Üretici", "Miktarı", "Birim", "Raf" + c_RESET);
        System.out.println();
        for (Map.Entry<Integer, Urunler> değer : Urunler.depodakiürünler.entrySet()) {
            int id = değer.getKey();
            String isim = değer.getValue().getIsim();
            String üretici = değer.getValue().getÜretici();
            int miktar = değer.getValue().getMiktarı();
            String birim = değer.getValue().getBirim();
            String raf = değer.getValue().getRaf();

            System.out.printf("%-20s%-20s%-10s%-15s%-10s%-10s", id, isim, üretici, miktar, birim, raf);
            System.out.println();
        }

    }

    private void uruntanımlama() {
        System.out.println("Ürünün İsmini Giriniz");
        String seçim = TryCatch.stringGirisi();
        int count=0;

        for (Map.Entry<Integer, Urunler> ürün : Urunler.depodakiürünler.entrySet()) {
            if (ürün.getValue().getIsim().equalsIgnoreCase(seçim)) {
                System.out.println("Ürün ID: " + ürün.getKey());

                break;
            }

           count++;
        }

       if(count==Urunler.depodakiürünler.entrySet().size()) {
           System.out.println("Böyle Bir Ürün Bulunamadı");
       }
    }

    public void musteri() {
        System.out.println("Müşteri İşlem Menüsü");


        System.out.println("Ürün Listeleme  1 ");
        System.out.println("Ürün Girişi 3");
        System.out.println("Ürünü Rafa Koy 4");
        System.out.println("Ürün Çıkışı 5 ");
        System.out.println("Çıkış 6 ");


        System.out.print("\tSeçiminiz : " + c_RESET);
        int secim = TryCatch.intGirisi();



    }
}



