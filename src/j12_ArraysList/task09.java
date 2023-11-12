package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class task09 {   /* TASK :
 * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
 * sayilardan olusan bir array haline getiren bir code create ediniz.
 *
 * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
 * OUTPUT : [1,2,3,4,5,6,7,8,9]
 */
    public static void main(String[] args) {

        int arr[]={2,2,3,1,4,2,1,5,6,8,7,5,9,1};
        List<Integer>tekrarsızlist=new ArrayList<Integer>();

        for (int w :arr) {
           if(!tekrarsızlist.contains(w)) {
               tekrarsızlist.add(w);
           }
        }
        Collections.sort(tekrarsızlist);
        System.out.println(tekrarsızlist);
   int tekarr[]=new int[tekrarsızlist.size()];
    for(int i=0; i<tekrarsızlist.size(); i++){
       tekarr[i]=tekrarsızlist.get(i);

    }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(tekarr));
    }
}




