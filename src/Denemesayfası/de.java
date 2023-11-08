package Denemesayfası;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class de {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 3, 6, 1};
        System.out.println("Orjinal array ="+ Arrays.toString(numbers));
        int temp;

            for (int j = 0; j < numbers.length-1; j++) {
                if (numbers[j]>numbers[j+1]){
                    temp=numbers[j];
                    numbers[j]=numbers[j+1];
                    numbers[j+1]=temp;
                }
            }

        System.out.println("Sirali array ="+Arrays.toString(numbers));
    }
}
