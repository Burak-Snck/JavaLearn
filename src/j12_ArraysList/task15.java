package j12_ArraysList;

import java.util.ArrayList;
import java.util.List;

public class task15 {
    public static void main(String[] args) {

 /* TASK :
    100 den kucuk asal sayilari print eden  code create ediniz.0
     */
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 2; i < 100; i++) {
            int count = 0;
            for (int j = 2; j < 100; j++) {
                if (i % j == 0) {
                    count++;
                }

            }
            if(count<2){
                list.add(i);
            }

        }
        System.out.println(list);
    }
}
