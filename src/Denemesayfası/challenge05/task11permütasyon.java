package Denemesayfası.challenge05;

import java.util.Scanner;

public class task11permütasyon {
    public static void main(String[] args) {


          /*  Problem Tanımı
  Verilen iki sayının kombinasyonunu bulan kodu yazınız.
  Hatırlatma C(n,r) = n! / (r!(n-r)!)
  Verilen iki sayının permütasyonunu bulan kodu yazınız.
  Hatırlatma P(n,r) = n! / (n-r)!
  Ekran Çıktısı
  Birinci sayıyı giriniz: 15
  Ikinci sayıyı giriniz: 4
  Kombinasyon: 1365
  permütasyon: 32760
  Birinci sayıyı giriniz: 5
  Ikinci sayıyı giriniz: 3
  Kombinasyon: 10
  permütasyon: 60
*/

        Scanner scanner = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        double n = scanner.nextDouble();
        System.out.print("Ikinci sayıyı giriniz: ");
        double r = scanner.nextDouble();
        double combination = calculateCombination(n, r);
        double permutation = calculatePermutation(n, r);
        System.out.println("Kombinasyon: " + combination);
        System.out.println("Permütasyon: " + permutation);
    }

    public static double calculateCombination(double n, double r) {
        return factorial(n) / (factorial(r) * factorial(n - r));
    }

    public static double calculatePermutation(double n, double r) {
        return factorial(n) / factorial(n - r);
    }

    public static double factorial(double number) {
        if (number == 0) {
            return 1;
        }
        double result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }
}



