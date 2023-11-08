package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task11 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Isim ve Soy isim giriniz.");
        String name=input.nextLine().replace(" ","");

        String nwName="";
        int count=0;
        while (count<=name.length()-1){


            nwName+=name.charAt(count);


            if(count<=name.length()-2){
                nwName+=" ";}
           count++;
        }
        System.out.println(nwName);
    }

}
