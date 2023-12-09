package j23_Encapsulation.Task.task04;

public class It {
    private String okulad;
    private String ad;
    private int yaş;

    public It(String okulad, String ad, int yaş) {
        this.okulad = okulad;
        this.ad = ad;
        this.yaş = yaş;
    }

    public It() {
    }

    public String getOkulad() {
        return okulad;
    }

    public void setOkulad(String okulad) {
        this.okulad = okulad;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public int getYaş() {
        return yaş;
    }

    public void setYaş(int yaş) {
        this.yaş = yaş;
    }

    @Override
    public String toString() {
        return "ıt{" +
                "okulad='" + okulad + '\'' +
                ", ad='" + ad + '\'' +
                ", yaş=" + yaş +
                '}';
    }
}
