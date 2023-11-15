package interviewQuestions01;

import java.util.Scanner;
import java.util.SortedMap;

public class Q001 {
    public static void main(String[] args) {


  /*
		// Stringi ters cevirmek icin bir Java Programi yazin
		//1.Yol: StringBuilder () kullanarak
		//2.Yol: String Classini kullanarak
		//3.Yol: Bir method olusturun, ardindan methodu main method dan cagirin
    */
        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str = input.nextLine();
        String[]arr=str.split("");
        String ss = "";


        System.out.println(ss);
        for (int i=str.length()-1;i>=0;  i--){
            System.out.print( arr[i]);
        }

    }
}



 


