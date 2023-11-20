package j19_Constructer;

public class C03_Student {
    String ad;
    String soyad;
    int sınıf=9;
    double ortalama;
    int okulno;
    boolean takdirbelgesi;

    public C03_Student(String ad, String soyad, int sınıf, double
            ortalama, int okulno, boolean takdirbelgesi) {
        this.ad = ad;
        this.soyad = soyad;
        this.sınıf = sınıf;
        this.ortalama = ortalama;
        this.okulno = okulno;
        this.takdirbelgesi = takdirbelgesi;
    }

    public C03_Student() {

    }

    public static void main(String[] args) {

        C03_Student s1 = new C03_Student();

s1.ad="bahti";






    }
}
