package Denemesayfası;

import java.util.Scanner;

public class harfveya_değil {

// girilene karakter harf mi değil mi
public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("karakter giriniz");
    Character karakter = input.next().charAt(0);
    if(karakter>='A'&& karakter<='Z'|| (karakter>='a'&& karakter<='z')){
        System.out.println("harftir");
    }else {
        System.out.println("değildir harf");
    }



}



}
