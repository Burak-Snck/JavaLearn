package j11_Arrays;

import java.util.Arrays;

public class C05_Arrays_equals {
    public static void main(String[] args) {

       int arr1[]={2,5,13,65,49,38,33,58,27};
       int arr2[]={21,52,14,63,49,31,35,53,26};
        System.out.println(Arrays.equals(arr1, arr2));//false
        System.out.println(arr1[3] == arr2[3]);//false
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));//false

        //  Array i String e çevirme
        // Array'ı String'e convert(çevirme)...
        String  str=Arrays.toString(arr1);
        System.out.println("str = " + str);//[2, 5, 13, 27, 33, 38, 49, 58, 65]
        System.out.println("str.substring(5) = " + str.substring(5));//, 13, 27, 33, 38, 49, 58, 65]






    }
}
