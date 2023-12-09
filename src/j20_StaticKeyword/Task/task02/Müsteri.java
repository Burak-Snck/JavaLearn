package j20_StaticKeyword.Task.task02;

public class Müsteri {
 String name;
 ElektrikHesap elektrikHesap;


    public Müsteri(String name) {
        this.name = name;
        this.elektrikHesap=new ElektrikHesap();

    }


    @Override
    public String toString() {
        return "Müsteri{" +
                "name='" + name + '\'' +
                ", elektrikHesap=" + elektrikHesap +
                '}';
    }


}
