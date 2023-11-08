package j05_ifStatementTernaryoperator.tasks;

import java.util.Scanner;

public class tasks05 {
    public static void main(String[] args) {

             /*
        Proje Konusu
Java dili ile kullanıcıdan alınan tutarın KDV'li fiyatını ve KDV tutarını print eden code create ediniz.
​
(Not : KDV tutarını 18% olarak alın)
​
Örnek Çıktı
Tutar Giriniz : 100
KDV Oranı : %18
KDV Tutarı : 18.00
KDV'li Tutar : 118.0
Bonus Geliştirme
Eğer girilen tutar 0 ve 500TL arasında ise KDV oranı %18 , tutar 500TL'den büyük ise KDV oranını %8 olarak KDV print eden code create eden
         */
        Scanner input= new Scanner(System.in);
        System.out.println("tutar giriniz");
        double tutar=input.nextDouble();
        if (tutar>0 && tutar <500){
            double kdv=tutar*0.18;
            System.out.println("KDV oranı : " + kdv);

        }else{
            double kdv=tutar*0.8;
            System.out.println("KDV oranı : "+ kdv);
        }



    }
}
