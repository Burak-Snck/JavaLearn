package j08_Loops.FoorLoop.task;

public class task19 {
    public static void main(String[] args) {


//        1
//        2 6
//        3 7 10
//        4 8 11 13
//        5 9 12 14 15   şekli print eden code create ediniz.
        for (int i = 1; i <= 5; i++) {
            int current = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(current + " ");
                current += 5 - j;
            }
            System.out.println();
        }
    }
}