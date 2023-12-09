package projeler.KahveSeçimi;

public class KahvePojo {
    private String name ;
    private String boy ;
    private String sut;
    private String seker;
    private int ucret;

    public KahvePojo() {
    }

    public KahvePojo(String name, String boy, String sut, String seker, int ucret) {
        this.name = name;
        this.boy = boy;
        this.sut = sut;
        this.seker = seker;
        this.ucret = ucret;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBoy() {
        return boy;
    }

    public void setBoy(String boy) {
        this.boy = boy;
    }

    public String getSut() {
        return sut;
    }

    public void setSut(String sut) {
        this.sut = sut;
    }

    public String getSeker() {
        return seker;
    }

    public void setSeker(String seker) {
        this.seker = seker;
    }

    public int getUcret() {
        return ucret;
    }

    public void setUcret(int ucret) {
        this.ucret = ucret;
    }

    @Override
    public String toString() {
        return "Kahve Secimi{" +
                "name='" + name + '\'' +
                ", boy='" + boy + '\'' +
                ", sut='" + sut + '\'' +
                ", seker='" + seker + '\'' +
                ", ucret=" + ucret +
                '}';
    }
}
