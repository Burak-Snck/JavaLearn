package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class replaceAll_fill {
    public static void main(String[] args) {
//replaceall();-> List'te belirli bir elemanı belirli bir elemana update eder.treu/ false return eder

        ArrayList<String> ulkelist = new ArrayList<>(Arrays.asList("Alamanya", "Güba", "Polkonya",
                "Dingiltere", "Amerigonya", "Güba"));
        System.out.println("Collections.replaceAll(ulkelist,\"Güba\",\"kolan\") = "
                + Collections.replaceAll(ulkelist, "Güba", "kolan"));
    }


}
