package Denemesayfası;

import java.util.Scanner;

public class test1 {

    public static class vkihesap{
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kilonuzu (kg) girin: ");
            double weight = scanner.nextDouble();

            System.out.print("Boyunuzu (metre cinsinden) girin: ");
            double height = scanner.nextDouble();


            double bmi = calculateBMI(weight, height);



            interpretBMI(bmi);

            System.out.println("Vücut Kitle İndeksi (BMI): " + bmi);


        }


        public static double calculateBMI(double weight, double height) {
            return weight / (height * height);
        }


        public static void interpretBMI(double bmi) {
            if (bmi < 18.5) {
                System.out.println("Zayıf");
            } else if (bmi < 25) {
                System.out.println("Normal");
            } else if (bmi < 30) {
                System.out.println("Kilolu");
            } else {
                System.out.println("Obez");
            }
        }
    }
}
