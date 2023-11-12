package j11_Arrays.tasks;

import java.util.Arrays;

public class task26 {
    /*
    Bir dizinin elemanlarini sort kullanmadan kucukten buyuge siralayiniz
     */
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 3, 6, 1};
        System.out.println("Orjinal array ="+ Arrays.toString(numbers));
        int temp;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length-1-i; j++) {
                if (numbers[j]>numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;

                }
            }
        }
        System.out.println("Sirali array ="+Arrays.toString(numbers));
    }

}
