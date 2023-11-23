package j19_Constructer;


public class C03_Student {
    String name;
    int sinif=9;
    double ort;
    int okulNo;
    boolean belge;

    public C03_Student(String name, int sinif, double ort, int okulNo, boolean belge) {
        this.name = name.toUpperCase();
        this.sinif = sinif;
        this.ort = ort;
        this.okulNo = okulNo;
        this.belge = belge;
    }

    public C03_Student() {
    }

    @Override
    public String toString() {
        return
                "name='" + name.toUpperCase() + '\'' +
                        ", sinif=" + sinif +
                        ", ort=" + ort +
                        ", okulNo=" + okulNo +
                        ", belge=" + belge ;

    }

    public static void main(String[] args) {
        /*
Task-> fields: ad, soyad, sınıf, ortalama, okulNo, takdirBelgesi olan 2 farklı obj ile
mezuniyet(ortalama 50 üstü ise mezun oldunuz) sosyalFaaliyet methodlarını  print eden code create ediniz.
 */
        C03_Student s1 = new C03_Student("Feride Boyraz",11,2.87,9184,true);
        System.out.println(s1);
        C03_Student s2 = new C03_Student();
        s2.name="Bahtiyar javaHan";
        s2.okulNo=1453;
        s2.ort=99;
        s1.sinif=12;
        System.out.println(s2);

        System.out.println(s1.mezuniyet(s1.ort));
        s1.sosyalFaaliyetVer();
        System.out.println(s2.mezuniyet(s2.ort));
        s2.sosyalFaaliyetVer();
    }

    private void sosyalFaaliyetVer() {
        System.out.println("barbeku show");}

    public String mezuniyet(double ort) {
        return  ort>50?"mezun oldunuz tebrikler":"mezun olmadiniz ";
    }


}
