package Denemesayfası.challenge05;

public class task09 {
    public static void main(String[] args) {


        //javayı  j*a*v*a olrak


       /*
        Task-> java ifadesni j*a*v*a olarak print eden code create ediniz..
         */
        for (int i = 0; i < "java".length(); i++) {
            System.out.print("java".charAt(i));

            if (i < "java".length() - 1) {
                System.out.print("*");
            }


        }
    }
}
