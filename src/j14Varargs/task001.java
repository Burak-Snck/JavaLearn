package j14Varargs;

import java.util.Scanner;

public class task001 {
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
        String strArr1[] = {"h", "a", "l", "u", "k"};
        String strArr2[] = {"a", "l", "i"};

        Scanner scanner = new Scanner(System.in);
        System.out.println("ilk kaç harfini yazdıracaksınız");
        int sayi = scanner.nextInt();
        istenilenkadar(sayi, strArr1, strArr2);

    }

    private static void istenilenkadar(int sayi, String[]... strArr) {


            for (String[] w : strArr) {

                for (String s:w) {
                    System.out.print(s);
                }

            }



    }
}
