package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class C11_LambdaObject {


/*
  TASK :
  fields --> Universite (String)
             bolum (String)
             ogrcSayisi (int)
             notOrt (int)
             olan POJO clas craete edip main method içinde 5 farklı obj'den List create ediniz.
   */


    public static void main(String[] args) {
        C10_University u01 = new C10_University("Bogazici", "Matematik", 571, 73);
        C10_University u02 = new C10_University("Istanbul", "Matematik", 622, 77);
        C10_University u03 = new C10_University("Marmara", "Hukuk", 1453, 52);
        C10_University u04 = new C10_University("Itu", "uçak muh.", 333, 63);
        C10_University u05 = new C10_University("Yıldız Teknik", "Gemi ", 216, 55);

        List<C10_University> unv = new ArrayList<>(Arrays.asList(u01, u02, u03, u04, u05));
        System.out.println("Task 01");

// Task01-> notOrt'larının 74'den buyuk oldg control eden code create ediniz...

        System.out.println(kontrolet(unv));
        System.out.println("Task 02");
        //task02->ogrc sayilarinin   110 den az olmadigini  kontrol eden code create ediniz.

        System.out.println(konrtolet2(unv));

        System.out.println("Task 03");
        //task03->universite'lerde herhangi birinde "matematik" olup olmadigini  kontrol eden code create ediniz.

        System.out.println(konrtolet3(unv));

        System.out.println("Task 04");
        //task04->universite'leri ogr sayilarina gore b->k siralayiniz.
      System.out.println(kontrolet4(unv));


        System.out.println("Task 05");
        //task05-> universite'leri notOrt gore  b->k siralayip ilk 3 'unu print eden code create ediniz...

        System.out.println(printNotOrtTersSiraIlk3(unv));

        System.out.println("Task 06");

        //task06-> ogrc sayisi en az olan 2. universite'yi  print eden code create ediniz...
        System.out.println(printOgrSayisiEnAz2(unv));

        System.out.println("Task 07");
        System.out.println("Task 08");
        System.out.println("Task 09");


    }
    public static List<C10_University> printNotOrtTersSiraIlk3(List<C10_University> unv){
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getNotOrt).reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    static List<C10_University> printOgrSayisiEnAz2(List<C10_University> unv){
        return unv
                .stream()
                .sorted(Comparator.comparing(C10_University::getOgrcSayisi))
                .limit(2)
                .skip(1)
                .collect(Collectors.toList());
    }

    public static List<C10_University>kontrolet4(List<C10_University> unv) {

        return unv.stream().sorted(Comparator.comparing(C10_University::getOgrcSayisi).reversed()).
                collect(Collectors.toList());










    }
    public static String konrtolet3(List<C10_University> unv) {
        return unv.stream().anyMatch(t->t.getBolum().equalsIgnoreCase("matematik")) ? "matematik var" : " matematik yok";

    }
    public static String konrtolet2(List<C10_University> unv) {
        return unv.stream().noneMatch(t->t.getOgrcSayisi()>=110) ? " üni öğrenci sayısı 110 dan büyük":
                "öğrenci sayısı 110 dan büyük değil";
    }
    public static String kontrolet( List<C10_University> unv){
      return   unv.stream().allMatch(t->t.getNotOrt()>74)? "üni not ortalamasının hepsi 74 den büyük":
              "üni not ortalaması 74 den küçük ";

    }

}
