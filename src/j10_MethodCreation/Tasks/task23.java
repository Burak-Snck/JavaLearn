package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task23 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        /*
        Task-> vucüt kitleendexini print eden METHOD create ediniz
        vki->kg(mt*mt)
     18,5 kg/m2 ve daha düşük değerler = Zayıf.
     18,5 ve 24,9 kg/m2 arasındaki değerler = Normal ağırlıkta.
     25,0 ve 29,9 kg/m2 arasındaki değerler = Kilolu.
     30,0 ve üstü =  obezite.

         */

        System.out.println("kilo ve boy giriniz ");
        double kilo= input.nextDouble();
        double boy= input.nextDouble();

        vki(kilo,boy);


    }//main sonu
    private static void vki(double kilo, double boy) {
        if ((kilo/(Math.pow(boy,2))*((kilo/Math.pow(boy,2))))<18.5){
            System.out.println("Zayıf");

        }else if(kilo/(Math.pow(boy,2))>=18.5 &&(kilo/Math.pow(boy,2))<=24.9){
            System.out.println("Normal");

        }else if((kilo/Math.pow(boy,2))>=25&&(kilo/Math.pow(boy,2))<=29.9){
            System.out.println(" Kilolusunuz");

        }else{System.out.println("Obezitesiniz");
        }
    }

}
