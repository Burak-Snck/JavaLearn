package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class C07_contains {
    public static void main(String[] args) {


        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya", "Dingiltere", "Amerigonya"));

        System.out.println("ulkelist.contains(\"kolonya\") = " + ulkelist.contains("kolonya"));//false
        System.out.println("ulkelist.contains(\"Güba\") = " + ulkelist.contains("Güba"));

    }
}
