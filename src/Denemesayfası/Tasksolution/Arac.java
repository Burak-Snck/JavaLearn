package Denemesayfası.Tasksolution;

public class Arac {
   /*
    1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
       olan Araba  isimli bir class cretae ediniz.
    2- bütün fieldları parametre alan bir constructor tanımlayınız.
    3- Runner isminde main için bir class oluşturunuz.
    4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
    5- aracların motor hacmi 1000 cc ve altı olması ve yılını hatalı veri girisine karsi kontrol ediniz.
      */

    // fields->private
    private String model;
    private String renk;
    private int motorHacmi;
    private int yil;


        // const


    public Arac(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        // this.motorHacmi = motor;
        setMotorHacmi(motor);
        //this.yil = yil;
        setYil(yil);
    }

    public Arac() {
    }

    // getter-setter
    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotorHacmi() {
        return motorHacmi;
    }

    public void setMotorHacmi(int motorHacmi) {
        if (motorHacmi < 1000) {
            this.motorHacmi = 1000;
        } else this.motorHacmi = motorHacmi;
        System.out.println("biraz düşür lütfen");
    }

    public int getYil() {
          if (yil < 1980) {

            return (this.yil=yil);

        } else return this.yil = yil;
    }

    public void setYil(int yil) {
        if (yil < 1990) {
            this.yil = yil;
            System.out.println("agam sen git faytona bin :( ");

        } else this.yil = yil;
    }
    //toString

    @Override
    public String toString() {
        return "Arac{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motorHacmi=" + motorHacmi +
                ", yil=" + yil +
                '}';
    }
}
