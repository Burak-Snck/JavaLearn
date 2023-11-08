package j13_ForEachLoop;

public class C03_FoorEachLoops {
    public static void main(String[] args) {

        // task -> array elamanlarının çarpımını print eden code create ediniz...-> with for-each

        int arr[][] = {
                {2, 3},
                {4},
                {5, 6, 7}
        };
        int çarpım=1;
        for (int[] avuc1:arr) {  //kat tekrarı
            for (int avuc2:avuc1) { //daire tekrarı
                çarpım*= avuc2;

            }

        }

        System.out.println(çarpım);
    }
}
