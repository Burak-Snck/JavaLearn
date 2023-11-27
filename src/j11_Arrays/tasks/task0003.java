package j11_Arrays.tasks;

import java.util.Arrays;

public class task0003 {
    public static void main(String[] args) {

           /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String str = "Hello World";
        String arr[] = str.split("");

        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("o")) {
                arr[i] = "K";
            }
        }
        System.out.println(Arrays.toString(arr));


        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i].replace("o", "K");
        }
        System.out.println(Arrays.toString(arr));
    }


}

