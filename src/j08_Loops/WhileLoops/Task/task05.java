package j08_Loops.WhileLoops.Task;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {

        /*
		task-> girilen  isim ve soyismi için ilk isminin ilk harfinden soy isminin son harfine kadar olan butun harfleri
		 ayni satirda aralarina bosluk birakarak print rden code create ediniz
		 */
        Scanner input = new Scanner(System.in);
        System.out.println("isim soyisim giriniz");
        String str=input.nextLine();
         String yenistr=str.replaceAll(" ","");
        int count=0;
        while (count<yenistr.length()) {

            System.out.print(yenistr.charAt(count)+" ");
            count++;

        }


    }

}
