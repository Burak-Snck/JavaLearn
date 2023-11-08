package j08_Loops.WhileLoops;

public class task {
    public static void main(String[] args) {
        // task-> 3 basamaklı 4 ile tam bölünen sayıları print eden code create ediniz

        for (int i = 100; i < 1000; i++) {
            if (i % 4 == 0) {
                System.out.println(i);


            }
        }

        int i = 99;
        while (i < 1000) {
            if (i % 4 == 0) {
                System.out.println(i + " ");
                i++;
            } else {
                i++;
            }
        }
    }
}