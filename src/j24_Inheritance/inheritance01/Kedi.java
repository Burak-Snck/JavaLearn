package j24_Inheritance.inheritance01;

public class Kedi extends Mammal{//Mammal patent (super) Classdan extend edilmiş sub

    public Kedi() {//p,siz modified const.
        System.out.println("psiz kedi class call edildi");
    }
    public void cırmalama(){
        System.out.println("koyunun en nefis yeri küşleme ");
    }
}