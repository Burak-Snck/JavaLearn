package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task22 {
    /* task->
      katsayıları a,b,c  verilen 1 bilinmeyenli ax^2 + bx + c denklemin köklerini print eden METHOD create ediniz.



      trick-> kokler : (-b +/- karekök(delta)) / (2*a)
        delta = b*b - 4*a*c

   */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Denklemin a, b ve c sayilarini giriniz\na: ");
        double a = input.nextInt();
        System.out.print("b: ");
        double b = input.nextInt();
        System.out.print("c: ");
        double c = input.nextInt();
        kokBul(a,b,c);
    }

    private static void kokBul(double a, double b, double c) {
        System.out.println("Denlemimiz= "+a+"x^2+"+b+"x+"+c);
        double delta=(b*b)-(4*a*c);
        if (delta>0){
            double x1=(-b+Math.sqrt(delta))/(2*a);
            double x2=(-b-Math.sqrt(delta))/(2*a);
            System.out.println("Denklemin kokleri kok1= "+x1+" Kok2= "+x2);
        } else if (delta==0) {
            double x=-b/(2*a);
            System.out.println("Denklemin koku= "+x);
        }else {
            System.out.println("Denlklemin koku yoktur");
        }
    }
}
