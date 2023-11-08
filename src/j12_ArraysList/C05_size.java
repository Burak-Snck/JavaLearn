package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class C05_size {
    public static void main(String[] args) {

        //get()-> listte girilen index'deki elemanı return eder. olmayan index için RTE exc. fırlatır
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.size() = " + ulkelist.size());

    }
}
