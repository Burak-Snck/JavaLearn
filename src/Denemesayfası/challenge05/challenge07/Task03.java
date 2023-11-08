package Denemesayfası.challenge05.challenge07;

import java.util.Scanner;

public class Task03 {
    // Bir metindeki kelime sayısını hesaplayan bir metot create ediniz

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
      String str=input.nextLine();

        String kelime= str.replaceAll(" ","");
        int  yenibir=kelime.length();
        int yeniiki=str.length();
        int count=0;

        System.out.println((yeniiki-yenibir)+1);

        for(int i=0; i<kelime.length(); i++){

            if(str.charAt(i)==' '){
                count++;

            }

        }
        System.out.println(count);


    }
}
