package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task12 {
    // Bir metindeki kelime sayısını hesaplayan bir metot create ediniz

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin= scan.nextLine().trim();
        int count=kacKelime(metin);
        System.out.println(count);

    }

    private static int kacKelime(String metin) {
        int count=0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i)==' '||metin.charAt(i)=='.'){
                count++;
            }
        }
        for (int i = 0; i < metin.length(); i++) {
            if (i!=metin.length()-1&&metin.substring(i,i+2).equals(". ")){
                count--;
            }
        }
        //return count;
        if (metin.contains(".")){
            return count;
        }else return count+1;

    }
}
