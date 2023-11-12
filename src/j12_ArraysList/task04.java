package j12_ArraysList;

public class task04 {
    public static void main(String[] args) {

 /*
    bir dizinin içindeki belirli bir öğeyi arayip indexini bulan code create ediniz
     */

            int[] numbers = {10, 20, 30, 40, 50};
            int searchElement = 30;
            boolean found = false;
            int positions = -1;
            for (int i = 0; i < numbers.length; i++) {
                if (numbers[i] == searchElement) {
                    found = true;
                    positions = i;
                    break;
                }
                System.out.println(positions);
            }
            if (found) {
                System.out.println(searchElement + " bulundu. Indexi = " + positions);
            } else System.out.println(searchElement + " bulunamadi.");

        }

}
