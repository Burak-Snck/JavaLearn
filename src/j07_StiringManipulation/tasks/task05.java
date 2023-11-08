package j07_StiringManipulation.tasks;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
        	/*  TASK :
				StringMethods:
				girilen  bir strngin ilk yarisini print eden code create ediniz
	    	    ORNEK:
		     	INPUT :istanbul
				OUTPUT :ista
		 */

        Scanner input= new Scanner(System.in);

        System.out.println("metin gir" );
        String metin=input.nextLine();
        System.out.println(metin.substring(0,metin.length()/2));



    }
}
