package Denemesayfası.Tasksolution;

import java.util.Scanner;

public class task4 {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println( "kelime gir");
        String s1=input.nextLine();
        if (s1.length()>=3){
           String s1kısa=s1.substring(s1.length()-2);
            System.out.println(s1kısa+s1kısa+s1kısa);
        }



    }
}
