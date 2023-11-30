package j24_Inheritance.inheritance01;

public class Mammal extends  Hayvancik {//hayvancık parent(super)classı extend eden child(sub)class

    public Mammal() {//p.szi cons modifiye edilmiş
        System.out.println("p,siz mammal class call edildi ");
    }


    public void sutBeslen(){
        System.out.println("süt ile besler bebelerini");
    }public void dogum(){
        System.out.println("yavrusu olur");
    }
}
