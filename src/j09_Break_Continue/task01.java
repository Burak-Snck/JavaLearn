package j09_Break_Continue;

import java.util.Scanner;

public class task01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("mail giriniz : ");
        String mail = input.next();


        for (int i = 0; i < mail.length(); i++) {//mail Str'nin 0 ile son index arsdsı tekrar tanımlandı
            // System.out.print(mail.charAt(i));
            if (mail.charAt(i) == '@') {//tekrardan gelen herbir index'i char'ının @' eşit olma şart
                continue;// if true verdiğinde loop kırılıma komutu

            }
            System.out.print(mail.charAt(i));// if false verdiğinde-> if çalışmazsa:loop break olmazsa tekrardaki herbir cahr'ı bas
        }


    }
}
