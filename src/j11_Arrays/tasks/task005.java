package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task005 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen  bir sayi giriniz");
        String num = input.next();
        String arr[] = num.split("");
        System.out.println(Arrays.toString(arr));
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
        }
    }
}