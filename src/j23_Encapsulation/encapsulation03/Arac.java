package j23_Encapsulation.encapsulation03;




public class Arac {
    private   String model;

   private String renk;
    private  int motor;

    private int yil;

    public int getMotor() {
        return motor;
    }

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yıl=" + yil +
                '}';
    }

    public int getYıl() {
        return 45;
    }

    public void setYıl(int yıl) {

        if(yıl<1990){

            System.out.println("faytona bin");


        }else  this.yil = yil;

    }

    public void setMotor(int motor) {


        if(motor<100){

            this.motor = 1000;
        }else this.motor=motor;

    }

    public Arac(int yıl) {
        this.yil = yil;
    }

    public Arac() {
    }

    public Arac(String model, String renk, int motor, int yıl) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

/*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
olan Araba  isimli bir class cretae ediniz.
2- bütün fieldları parametre alan bir constructor tanımlayınız.
3- Runner isminde main için bir class oluşturunuz.
4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
  */



}
