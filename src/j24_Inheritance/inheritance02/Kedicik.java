package j24_Inheritance.inheritance02;

public class Kedicik extends Mammal{//parent(super) Mammal Class'dan extend edilen child(sub) Class
    int c=2;//initial int type inst. variable
    int d=7;//initial int type inst. variable

    public Kedicik() {//dafult p'siz const.
        super();
        System.out.println("Agam ahan da KEDİCİK p'siz const call edildi :) ");
    }

    public Kedicik(String  str) {//1 p'li const.
        this();
        System.out.println("super.c = " + super.c);
        System.out.println("Agam ahan da KEDİCİK p'li const call edildi :) ");
    }
    @Override//@Override annotation-> overriden(eziled) meth ile ovveride (ezen) meth ilişkilendirir.
    public void mC(){
        System.out.println("mC -> KEDİCİK Class meth. call edildi :) ");

    }

    @Override
    public String toString() {
        return
                "c=" + c +
                        ", d=" + d + super.toString();
    }


}
