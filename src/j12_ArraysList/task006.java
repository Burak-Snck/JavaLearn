package j12_ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class task006 {
    public static void main(String[] args) {

          /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         print eden code create ediniz.
​
        */
        ArrayList<Integer>list=new ArrayList<Integer>(6);
        Scanner scanner=new Scanner(System.in);
        for(int i=0;i<6;i++){

            System.out.println(i+1+"inci indeksi giriniz");
            int a=scanner.nextInt();
            list.add(a);


        }
        System.out.println(list);
        ArrayList<Integer>list2=new ArrayList<Integer>(6);

        for(int i=0;i<list.size();i++){
        if(list.get(i)%2==1){
           list2.add(list.get(i));
        }
        }
        System.out.println(list2);

    }
}
