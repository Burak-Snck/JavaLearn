package projeler;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class bakkal_amca {



    static List<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"));
    static Scanner scan = new Scanner(System.in);
    static List<Double> gunlukKazanclar = new ArrayList<>();
    public static void main(String[] args) {
        List<String> ortalamaUstuGunler = new ArrayList<>();
        List<String> ortalamaAltiGunler = new ArrayList<>();
        int i=0;
        while (i<7){
            System.out.println(gunler.get(i)+" gunu kazancinizi giriniz");
            double kazanc= scan.nextDouble();
            gunlukKazanclar.add(kazanc);
            i++;
        }
        for (int j = 0; j < gunler.size(); j++) {
            System.out.println(gunler.get(j)+" gunu kazanciniz : "+gunlukKazanclar.get(j));
        }
        double ortalama=getOrtalamaKazanc();
        int ort= (int) (ortalama*100);
        ortalama= (double) ort /100;
        System.out.println("Ortalama kazanc: "+ortalama);
        ortalamaUstuGunler=getOrtalamaninUstundeKazancGünleri(ortalama,ortalamaUstuGunler);
        System.out.println("Ortalaama ustu gunler: "+ortalamaUstuGunler);
        ortalamaAltiGunler=getOrtalamaninAltindaKazancGünleri(ortalama,ortalamaAltiGunler);
        System.out.println("Ortalama alti gunler: "+ortalamaAltiGunler);
    }
    private static List<String> getOrtalamaninAltindaKazancGünleri(double ortalama, List<String> ortalamaAltiGunler) {
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(ortalama>gunlukKazanclar.get(i)){
                ortalamaAltiGunler.add(gunler.get(i));
            }
        }
        return ortalamaAltiGunler;
    }
    private static List<String> getOrtalamaninUstundeKazancGünleri(double ortalama, List<String> ortalamaUstuGunler) {
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            if(ortalama<gunlukKazanclar.get(i)){
                ortalamaUstuGunler.add(gunler.get(i));
            }
        }
        return ortalamaUstuGunler;
    }
    private static double getOrtalamaKazanc() {
        double toplam=0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplam+=gunlukKazanclar.get(i);
        }
        return toplam/7;
    }


}
