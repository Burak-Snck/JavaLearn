package j24_Inheritance.inheritance02;

public class Runner {
    public static void main(String[] args) {
    // DataType obj = new Constructor();
    Kedicik k1 = new Kedicik();//Kedicik Class data type obj create edilid
    System.out.println("k1.a = " + k1.a);//
    System.out.println("k1.ccccccc = " + k1.c);//
    System.out.println("k1.d = " + k1.d);//
    System.out.println("k1.m = " + k1.m);//

    System.out.println("   ***   ");

    Mammal k2 = new Kedicik("zuzu");//Mammal data type obj create edildi
    System.out.println("k2.a = " + k2.a);//
    System.out.println("k2.fffffcccccccccc = " + k2.c);//
    // System.out.println("k2.d = " + k2.d);//CTE -> dataType Mammal Class'da d variable tanımlı değil
    System.out.println("k2.m = " + k2.m);//

    System.out.println("   ***   ");
    Hayvancık k3=new Kedicik("pambik");//Hayvancık data type obj create edildi
    System.out.println("k3.a = " + k3.a);//
    System.out.println("k3.m = " + k3.m);//
    // System.out.println("k3.c = " + k3.c);//CTE -> dataType Hayvancık Class'da c variable tanımlı değil
    // System.out.println("k3.d = " + k3.d);//CTE -> dataType Hayvancık Class'da d variable tanımlı değil
/*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj varaible  Data type göre call edilir
 Variable araştırmaya data type Class'dan başlanıp parentlere gidilir
 */
        k1.mC();
        k1.mM();
        k1.mA();

        /*
 Ahan da trick köşesinde böğün:inherit edilmiş herhangi bir obj methodları  cons. göre call edilir
 method araştırmaya cons. Class'dan başlanıp parentlere gidilir
 */
}
}

