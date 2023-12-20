package DepoProje;

public class DepoRunner {
    public static void main(String[] args) throws InterruptedException {
        Urunler ürün = new Urunler();
        ürün.ekleUrunler();

        AnaMenu marş = new AnaMenu();

        marş.anaekran();


    }


}
