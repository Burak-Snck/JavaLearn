package j21_Scope;

import j07_StiringManipulation.C01_Concatenation;

public class C04_Scope {
    public static void main(String[] args) {

        C01_InstanceVariable obj1=new C01_InstanceVariable();// istenilen Calss'dan cosnt. call edilerek obj create edilebilir.

        C01_Concatenation obj2=new C01_Concatenation();
        obj1.non_staticMethod();//oıbj ile non-static meth call
        System.out.println("obj1.developer = " + obj1.isim);//obj ile obj variable call
        C01_InstanceVariable.staticMethod();//ClassName ile static meyth call edildi




    }
}

