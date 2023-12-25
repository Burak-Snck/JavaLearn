package DepoProje;

import java.util.HashMap;
import java.util.Map;

public class Urunler  {


    private String isim;
    private String üretici;
    private int miktarı ;
    private String birim;
    private String raf;
    static Map<Integer,Urunler > depodakiürünler = new HashMap<>();


    public static Map<Integer, Urunler> getDepodakiürünler() {
        return depodakiürünler;
    }

    public static void setDepodakiürünler(Map<Integer, Urunler> depodakiürünler) {
        Urunler.depodakiürünler = depodakiürünler;
    }

    public Urunler(String isim, String üretici, int miktarı, String birim, String raf) {
        this.isim = isim;
        this.üretici = üretici;
        this.miktarı = miktarı;
        this.birim = birim;
        this.raf = raf;
    }

    public static void ekleUrunler() {
        Urunler urun = new Urunler("Portakalagit status", "İsrail", 50, "Kasa", "A1");
        Urunler urun1 = new Urunler("Muz", "Türkiye", 34, "Kasa", "A1");
        Urunler urun3 = new Urunler("Patates", "Romanya", 99, "Çuval", "A2");
        depodakiürünler.put(1001, urun);//DAHA ÇOK ÜRÜN EKLEME
        depodakiürünler.put(1002, urun1);//
        depodakiürünler.put(1003,urun3);
    }

    public Urunler() {
    }

    public Urunler(int id, String isim, String üretici, int miktarı, String birim, String raf) {

        this.isim = isim;
        this.üretici = üretici;
        this.miktarı = miktarı;
        this.birim = birim;
        this.raf = raf;
    }





    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getÜretici() {
        return üretici;
    }

    public void setÜretici(String üretici) {
        this.üretici = üretici;
    }

    public int getMiktarı() {
        return miktarı;
    }

    public void setMiktarı(int miktarı) {
        this.miktarı = miktarı;
    }

    public String getBirim() {
        return birim;
    }

    public void setBirim(String birim) {
        this.birim = birim;
    }

    public String getRaf() {
        return raf;
    }

    public void setRaf(String raf) {
        this.raf = raf;
    }

    @Override
    public String toString() {
        return "Urunler"+

                ", isim='" + isim + '\'' +
                ", üretici='" + üretici + '\'' +
                ", miktarı=" + miktarı +
                ", birim='" + birim + '\'' +
                ", raf='" + raf + '\''  ;

    }
}
