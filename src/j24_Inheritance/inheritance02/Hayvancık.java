package j24_Inheritance.inheritance02;

public class Hayvancık { // dede class
    int a;
    int m =3;

    public Hayvancık() {//p siz default constructor ama modifiye edilmiş

        System.out.println("agam ahanda psiz const call edildi:)");
    }

    public Hayvancık(int x) {
        System.out.println("ahanda p li const call edildi");
    }
    public void mA(){
        System.out.println("mA çalıştı");
    }
}
