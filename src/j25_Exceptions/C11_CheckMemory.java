package j25_Exceptions;

import java.util.Date;

public class C11_CheckMemory {
    public static void main(String[] args) {
         Runtime rt=Runtime.getRuntime();
        System.out.println("rt.totalMemory() = " + rt.totalMemory());
        System.out.println("rt.freeMemory() = " + rt.freeMemory());


        Date d=null;
        for(int i=0; i<10000; i++) {
            d=new Date(i);//10000 tane obje create edildi

            d=null;

        }
        System.out.println("loop sonrası Free Memory"+ rt.freeMemory());
        rt.gc();
        System.out.println("gc silinmes onrası Free Memory"+ rt.freeMemory());
    }


}


