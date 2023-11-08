package j05_ifStatementTernaryoperator.tasks;
import java.util.Scanner;
public class tasks04 {
    public static void main(String[] args) {


           /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */

     Scanner input = new Scanner(System.in);
        System.out.println("ehliyet var ise 1 yoksa 0 gir :");
      //  char ehliyet = input.nextLine().charAt(0);
      int ehliyet =input.nextInt();

        if (ehliyet==1){
            System.out.println("tecrübe yılını gir");
            int tecrübeyıl=input.nextInt();

            if (tecrübeyıl>=7){
                System.out.println("km gir");
                int km=input.nextInt();
                if (km>=100000){ //bütün şartları sağlayan

                    System.out.println("anahtar sizindir");

                }else{
                    System.out.println("kontak almanız için" + (100000-km)+" km lazım");
                }

            }
            else{
                System.out.println(" kontak almak için " + (7-tecrübeyıl)+ "yıl ekisğin var");
            }

        }else if (ehliyet==0) {
            System.out.println("ehliyetin yok anahtar da yok");

        }else {
            System.out.println("güzel gir");
        }



    }
}
