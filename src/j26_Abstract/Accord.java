package j26_Abstract;

public class Accord extends Honda{
    @Override
    void kapı() {
        System.out.println("yavaş kapat");
    }

    @Override
    public void motor() {
        System.out.println("yüksek motor çok yakar");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk iyidir");
    }
    void sunroof() {
        System.out.println("açık açık ferah");
    }
}
