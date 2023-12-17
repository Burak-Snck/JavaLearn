package projeler.OkulYönetimi;

public class Kisi {
    private String adSoyad = "";
   private String yas = "";
  private   String  kimlikno="";

    public Kisi() {
    }

    public Kisi(String adSoyad, String yas, String kimlikno) {
        this.adSoyad = adSoyad;
        this.yas = yas;
        this.kimlikno = kimlikno;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getYas() {
        return yas;
    }

    public void setYas(String yas) {
        this.yas = yas;
    }

    public String getKimlikno() {
        return kimlikno;
    }

    public void setKimlikno(String kimlikno) {
        this.kimlikno = kimlikno;
    }

    @Override
    public String toString() {
        return "Kisi{" +
                "ad Soyad='" + adSoyad + '\'' +
                ", yas='" + yas + '\'' +
                ", kimlik no='" + kimlikno + '\'' +
                '}';
    }
}
