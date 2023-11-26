package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class C03_indexoff {
  //  /indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan elelman için -1 return eder

    ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));

    public static void main(String[] args) {

        //indexOf()-> list içinde istenen eleman var ise index'ini return eder olmayan eleman için -1 return eder.

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba","Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.indexOf(\"alamanya\") = " + ulkelist.indexOf("alamanya"));//-1->case sensitive -> olamayan eleman
        System.out.println("ulkelist.indexOf(\"Alamanya\") = " + ulkelist.indexOf("Alamanya"));//0
        System.out.println("ulkelist.indexOf(\"Patogonya\") = " + ulkelist.indexOf("Patogonya"));//-1 ->olmayan eleman

        ulkelist.add("Polkonya");
        System.out.println("ulkelist = " + ulkelist);// [Alamanya, Güba,Güba, Polkonya, Dingiltere,Polkonya,Amerigonya, Polkonya]
        System.out.println("ulkelist.indexOf(\"Polkonya\") = " + ulkelist.indexOf("Polkonya"));//2-> tekrarlı elemanlarda soldan sağa işk bulunan  eleman index return eder
        System.out.println("ulkelist.lastIndexOf(\"Polkonya\") = " + ulkelist.lastIndexOf("Polkonya"));//5
        System.out.println("ulkelist.lastIndexOf(\"kolonya\") = " + ulkelist.lastIndexOf("Güba"));//1

    }


}
