package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task03 {


    public static void main(String[] args) {

    // saat saniye ye mili km ye kg yi gr ma çeviren method


        Scanner scan=new Scanner(System.in);
        System.out.println("saat gir");
        double saat=scan.nextDouble();
        System.out.println("mil gir");
        double mil=scan.nextDouble();
        System.out.println("kg gir");
        double kg=scan.nextDouble();


        ceviren(saat,mil,kg);
    }//main sonu
    public static void ceviren(double s,double m,double k) {
        s= s * 3600;
        m=m * 1.60934;
        k=k * 1000;
        System.out.println(s);
        System.out.println(m);
        System.out.println(k);




    }
}
