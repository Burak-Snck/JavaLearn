package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class C06_isEmpty_Clear {
    public static void main(String[] args) {
        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        System.out.println("ulkelist.isEmpty() = " + ulkelist.isEmpty());


        //clear    listeyi siler atar



        ArrayList<String> ulkelist1 = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));
        ulkelist1.clear();
        System.out.println("ulkelist1.size() = " + ulkelist1.size());
        System.out.println("ulkelist1 = " + ulkelist1);
        System.out.println("ulkelist1.isEmpty() = " + ulkelist1.isEmpty());

    }
}
