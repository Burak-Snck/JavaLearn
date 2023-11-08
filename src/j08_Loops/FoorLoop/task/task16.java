package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task16 {
    public static void main(String[] args) {


   /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz
​
        input : selam javaCAN'lar
        output : a sayısı :3
         */

        Scanner input = new Scanner(System.in);
        System.out.println("Gadın anam ele  biseyler giresen : ");
        String metin = input.next();// selam javaCAN'lar
        System.out.println("hangi harfi saydırmak isitirsen :");
        char harf = input.next().charAt(0);// a
        int harfsayısı=0;
        for(int i=1;i<metin.length();i++){

if(metin.charAt(i)==harf){
    harfsayısı++;
      }


        }
        System.out.println(harfsayısı);



    }
}
