package interviewQuestions01;

import java.util.Scanner;

public class Q02_MergeCertainCharacters {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir metin giriniz");
        String str=input.nextLine();
        System.out.println("kaç defa yazdırayım");
        int sayı=input.nextInt();
        System.out.println(ilksonyazdır(str,sayı));

    }//main sonu

    private static String ilksonyazdır(String str, int sayı) {
        String output="";
        for(int i=0; i<sayı;i++){
            output+=""+str.charAt(0)+str.charAt(str.length()-1);
           // output+=str.substring(0,1)+str.substring(str.length()-1);

        }
        return output;
    }
}//class sonu
