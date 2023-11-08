package j07_StiringManipulation;

import java.util.Scanner;

public class C14_Practise {

    public static void main(String[] args) {

 /*Task-> Girilen ir String'deki bir karakterin tekrarlı veya tekrarsız
  olmasını kontrol eden code create ediniz
Ör: Helloooo==> H-> Tekrarsız     e-->Tekrarsız   l--> Tekrarlı   o-->Tekrarlı
 */
        Scanner input = new Scanner (System.in);
        System.out.println("password gir");
        String password = input.nextLine();
        System.out.println("karakter gir ");
        char c=input.next().charAt(0);

        if(password.indexOf(c)==password.lastIndexOf(c))
        {
            System.out.println("tekrarsız");
        }else {
            System.out.println("tekrarlı");
        }



    }


}
