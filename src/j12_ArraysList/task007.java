package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;

public class task007 {
    /* TASK :
     * 10 elamanli bir list olusturun. Ardindan dizinin 3. elemani ile
     * 8. elemaninin yerlerini degistirin.
     *
     * ORNEK:
     *
     * INPUT : String[] isimler={"Haluk","Emin","Kemal","Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"};
     * OUTPUT : String[] isimler={"Haluk","Emin","Furkan","Kerem","Taylan","Orhan","Sinan","Kemal","Ahmet","Ali"};
     */
    public static void main(String[] args) {


        ArrayList<String>list = new ArrayList<String>(Arrays.asList("Haluk","Emin","Kemal",
                "Kerem","Taylan","Orhan","Sinan","Furkan","Ahmet","Ali"));

  String temp= list.get(3);
  list.set(3,list.get(8));
  list.set(8,temp);

        System.out.println(list);





    }

}
