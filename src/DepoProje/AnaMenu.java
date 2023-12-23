package DepoProje;

public class AnaMenu implements IAnaMenu {
    static String c_RESET = "\u001B[0m";
    static String BOLD = "\033[0;1m";
    static String c_BLUE = "\u001B[34m";
    static String c_RED = "\u001B[31m";
    static String c_GREEN = "\u001B[32m";
    Islemler yıslem = new Islemler();


    public void varolanlar() {

    }

    public void anaekran() throws InterruptedException {

        System.out.println(BOLD + c_GREEN + "-----------------------");
        System.out.println("DEPO YÖNETİM PANELİ");
        System.out.println("MÜŞTERİ GİRİŞİ İÇİN   1 ");
        System.out.println("YETKİLİ GİRİŞİ İÇİN 2");
        System.out.println("ÇIKIŞ İÇİN 3" + c_RESET);

        System.out.println("SEÇİNİZ : ");
        int seçim = TryCatch.intGirisi();
        Islemler islem = new Islemler();

        try {
            switch (seçim) {
                case 1:
                    System.out.println("Müşteri Girişine Yönlendiriliyorsunuz");
                    Thread.sleep(3000);
                    musteriGirisi();
                    break;

                case 2:
                    System.out.println("Yetkili Girişine Yönlendiriliyorsunuz");
                    Thread.sleep(3000);
                    yetkiligirisi();
                    break;

                case 3:
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
                    çıkışekranı();
                    break;

                default:
                    System.out.println(c_RED + "****Hatali giris*****" + c_RESET);
                    anaekran();
                    break;
            }
        } catch (Exception e) {
            System.out.println(c_RED + "****Hatali giris*****" + c_RESET);
            anaekran();
        }

    }

    public void çıkışekranı() {
        System.out.println("Çıkış Yaptınız");
    }

    public void yetkiligirisi() {

        yıslem.yetkili();

    }

    public void musteriGirisi() {

        yıslem.musteri();
    }


}
