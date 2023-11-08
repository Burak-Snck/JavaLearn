package j13_ForEachLoop;

import java.util.ArrayList;

public class ForEachLoop {
    public static void main(String[] args) {

// task-> iki string array elemanlarının ortak olmasını kontrol edip
// print eden code create ediniz..with for-each
String arr1[]={"Abdullah","Ferhat","Şennur","Şahin","Ayşe","Can","Burak"};
String arr2[]={"Şebnem","Haluk","Merve ","Şennur","Ayşe","Javacan","Javasu"};
        ArrayList<String>ortakısımlıst=new ArrayList<String>();//ortak isimlerin olacağı boş list
        for (String avuc:arr1) {  // abdullahgiller
            for (String avuc2:arr2) {// şebnemgiller
                if(avuc.equals(avuc2)){
                    ortakısımlıst.add(avuc);
                }

            }

        }
        System.out.println(ortakısımlıst);
    }
}
