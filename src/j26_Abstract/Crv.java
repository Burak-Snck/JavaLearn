package j26_Abstract;

public class Crv extends Honda {
    @Override
    void kapı() {
        System.out.println("kapıya iyi davran ");
    }

    @Override
    public void motor() {
        System.out.println("4 çarpı 4");
    }//concreate child class

    @Override
    void koltuk(){
        System.out.println("koltuk güzel");

    }


    // almak zorunda değilin aşağıdakini


    @Override
    void sunroof() {
        System.out.println("lüks için sunroof");
    }
}
