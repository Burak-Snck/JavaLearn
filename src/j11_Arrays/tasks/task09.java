package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task09 {
    public static class Task09 {
        public static void main(String[] args) {
            // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz
            Scanner sc = new Scanner(System.in);
            int[] arr = new int[5]; // 5 tane ama , oda numarası 0,1,2,3,4
            for (int i = 0; i < arr.length; i++) {
                System.out.print(i + ".index elemani giriniz");
                arr[i] = sc.nextInt();
            }
            System.out.println("Orjinal array= " + Arrays.toString(arr));
            for (int i = arr.length - 1; i >= 0; i--) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
