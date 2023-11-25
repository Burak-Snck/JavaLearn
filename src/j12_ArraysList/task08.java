package j12_ArraysList;

import java.util.ArrayList;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {

        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.
        Scanner scanner = new Scanner(System.in);
        System.out.println("sayıları giriniz bitince 0 giriniz");
        ArrayList<Integer> list = new ArrayList<>();
        while (true) {

            int sayı = scanner.nextInt();
            if (sayı != 0) {

                list.add(sayı);

            } else {
                break;

            }

        }
        System.out.println(list);
int toplam=0;
        for (int b:list) {
            toplam+=b;
        }
        double ortalama=toplam/list.size();
        System.out.println(ortalama);
        for (int c:list) {
            if(c>ortalama){
                System.out.println(c);

            }
        }
    }
}
