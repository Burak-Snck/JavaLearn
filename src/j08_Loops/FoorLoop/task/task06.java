package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task06 {
    public static void main(String[] args) {
        //task -> verilen bir tam sayinin rakamlari toplamini print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");
        Integer num = input.nextInt();

        String strnum = String.valueOf(num);

        int tplm = 0;

        for(int i = 0; i < strnum.length(); i++) {
            tplm+=num%10;
            num=num/10;

        }
        System.out.println(tplm);
    }
}
