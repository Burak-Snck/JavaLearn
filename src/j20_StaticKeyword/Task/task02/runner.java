package j20_StaticKeyword.Task.task02;

public class runner {
    public static void main(String[] args) {


        Musteri musteri = new Musteri();
        musteri.name="ali";



        ElektrikHesap hesap = new ElektrikHesap();

        musteri.elektirikHesap=hesap;

      musteri.elektirikHesap.tüketimEkle(566);
        musteri.elektirikHesap.tüketimEkle(150);

        System.out.println("toplam tuketim::"+musteri.elektirikHesap.toplamTuketim);
        System.out.println("odenecek tuttar::"+musteri.elektirikHesap.odenecekTutar());
        System.out.println("odenecek tuttar::"+musteri.elektirikHesap.fatura); //2.yontem
    }

}




