package projeler.OkulYönetimi;

import java.util.HashMap;
import java.util.Map;

public class Ogretmen extends Kisi{
    static Map<String, Ogretmen> ogretmenListesiMap = new HashMap<>();
    private String sicil = "";
    private String bolum = "";

    public Ogretmen() {
    }

    public Ogretmen(String adSoyad, String yas, String kimlikno) {
        super(adSoyad, yas, kimlikno);

    }

    public String getSicil() {
        return sicil;
    }

    public void setSicil(String sicil) {
        this.sicil = sicil;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    @Override
    public String toString() {
        return "Ogretmen{" +
                "sicil='" + sicil + '\'' +
                ", bolum='" + bolum + '\'' +
                super.toString() ;
    }
}
