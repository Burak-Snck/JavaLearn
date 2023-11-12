package j11_Arrays.tasks;

public class task23 {
    public static void main(String[] args) {

  /*
        bir dizideki tekrar eden öğeleri bulacak bir code create ediniz
         */


        int[] numbers = {2, 4, 6, 2, 7, 8, 6, 9, 10, 4};
        for (int w = 0; w < numbers.length; w++) {

            for (int i = w + 1; i < numbers.length; i++) {
                if (numbers[w] == numbers[i]) {
                    System.out.print(numbers[i] + " ");
                }
            }
        }
    }


}

