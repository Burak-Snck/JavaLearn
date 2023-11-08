package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class üslü {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir metin giriniz");
        String metin = scan.nextLine().trim();
        int count = kacKelime(metin);
        System.out.println(count);

    }

    private static int kacKelime(String metin) {
        int count = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == ' ' || metin.charAt(i) == '.') {
                count++;
            }

        }
        if(metin.contains(metin.replaceAll("[^.?,*]",""))){
            return count;
        } else if ( metin.indexOf(".")+1==metin.indexOf(" ")) {

            return count-1;

        }else return count+1;

    }
}
