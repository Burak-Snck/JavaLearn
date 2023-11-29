package j23_Encapsulation.encapsulation02;

public class Kisi {

    private String ad;
   private String soyad;
    private String password;
     private int yas;

    public Kisi(String ad, String soyad, String password, int yas) {
        this.ad = ad;
        this.soyad = soyad;
        this.password = password;
        this.yas = Math.abs(yas);

    }

    public Kisi(String ad) {
        this.ad = ad;
    }

    public Kisi() {
    }

    public void setPassword(String password) {
        this.password = password;
    }




    @Override
    public String toString() {
        return
                "ad='" + ad + '\'' +
                ", soyad='" + soyad + '\'' +
                ", password='" + password + '\'' +
                ", yas=" + yas ;

    }

    public String getPassword() {
        return password;
    }

    public static void main(String[] args) {






    }
}
