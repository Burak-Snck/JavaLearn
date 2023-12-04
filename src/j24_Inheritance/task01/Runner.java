package j24_Inheritance.task01;

public class Runner {


    public static void main(String[] args) {
        A a=new A();
        System.out.println(a.nn);
        System.out.println(A.nn);//adıla ile  yani a ile gelmedi class ile geldi
        B b=new B();
        System.out.println(b.nn);
        System.out.println(B.nn);
        System.out.println(A.nn);

    }
}
