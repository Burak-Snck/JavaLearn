package j08_Loops.Loop01_FoorLopp.Tasks;

public class Task06 {
    public static void main(String[] args) {
        // 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuarıdaki çarpım tablosunu 10 a kadar print eden code create ediniz.


        for (int i = 1; i <= 10; i++) {
            System.out.println("1 X " + i + "=" + " " + 1 * i);


        }

        for ( int çrp=1; çrp <= 10;çrp++ ) {
            for(int çrp2=1; çrp2<=10; çrp2++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
