package Denemesayfası.deneme1;

public class Meyve {
    private String isim;
    private String ülke;

    public Meyve(String isim, String ülke) {
        this.isim = isim;
        this.ülke = ülke;
    }

    // Constructor

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getÜlke() {
        return ülke;
    }

    public void setÜlke(String ülke) {
        this.ülke = ülke;
    }
}
