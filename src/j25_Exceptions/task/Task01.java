package j25_Exceptions.task;

import java.util.Scanner;

public class Task01 {




    public static void main(String[] args) {

     Scanner input=new Scanner (System.in);
     String password=input.nextLine();


     try {

         if(password.length()<6 || password.length()>10){

             throw new IllegalArgumentException("6dan büyük 10 dan az olmalı");

         }else System.out.println("test başarılı bbbbb");

     }catch (Exception e){
         System.out.println("e.getMessage() = " + e.getMessage()+"tekrar gir");
         System.out.println("okuduysan exc fırlattı  düzelttik");


     }


        System.out.println("test  başarılı");




    }
}
