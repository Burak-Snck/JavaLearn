package j07_StiringManipulation;

import java.util.Scanner;

public class C13_Practice {


    public static void main(String[] args) {


/*
Task->  girilen bir password için aşagıdaki şartları sağlarsa "gayet başarılı DEWAMKEEE :)"
sağlamazsa "Çok başarısız :( agam yeni paaword giresen" print eden code create ediniz.
1-en az 8 karakter uzunlugunda,
2-ilk harf buyuk,
3-son harf kucuk,
4-boşluk içermemeli
 */
        Scanner input = new Scanner (System.in);
        System.out.println("password gir");
        String password = input.nextLine();
        if (password.length() >=8 &&
                Character.isUpperCase(password.charAt(0))&& //ilk karakter büyük
                Character.isLowerCase(password.charAt(password.length()-1))&&
                        !password.contains(  " ")  ) {
            System.out.println("devam et güzel");
        } else {
            System.out.println("yanlış");
        }
    }
}
