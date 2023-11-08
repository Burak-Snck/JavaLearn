package j11_Arrays.tasks;

import java.util.Arrays;

public class task014 {
     /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

    public static void main(String[] args) {
        String str = "ade1r4d3";
        String[] arr = str.split("");


        System.out.println(Arrays.toString(arr));
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {

                toplam += Integer.parseInt(arr[i]);
            }
            System.out.println(toplam);
        }

    }
}
