package j20_StaticKeyword.Task.task02;

import com.sun.tools.javac.Main;

public class Runner {

    public static void main(String[] args) {

Müsteri mst=new Müsteri("ALİ");
mst.elektrikHesap.tuketimekle(100);
mst.elektrikHesap.tuketimekle(1000);

        System.out.println(mst.name + " " + mst.elektrikHesap.toplamtüketim);
        System.out.println( mst.elektrikHesap.odenecektutar());


    }


}
