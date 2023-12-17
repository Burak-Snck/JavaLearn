package projeler.OkulYönetimi;

import projeler.OkulYönetimi.Kisi;

import java.util.HashMap;
import java.util.Map;

public class Ogrenci extends Kisi {
    static Map<String, Ogrenci> ogrenciListesiMap = new HashMap<>();
    private String sinif = "";
    private String numara = "";

    public Ogrenci() {
    }

    public Ogrenci(String sinif, String numara) {
        super();
        this.sinif = sinif;
        this.numara = numara;
    }

    public String getSinif() {
        return sinif;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    public String getNumara() {
        return numara;
    }

    public void setNumara(String numara) {
        this.numara = numara;
    }

    @Override
    public String toString() {
        return "Ogrenci{" +
                "sinif='" + sinif + '\'' +
                ", numara='" + numara + '\'' +
                '}';
    }
}
