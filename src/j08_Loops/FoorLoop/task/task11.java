package j08_Loops.FoorLoop.task;

public class task11 {
    public static void main(String[] args) {


            /* Ex-1: Asagidaki ciktiyi verecek kodu yaziniz
            1.
                        IT: 1
                          QA: 1
                          QA: 2
                          QA: 3
                          .....
                        IT: 2
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
                        IT: 3
                          QA: 1
                          QA: 2
                          QA: 3
                          ....
         */



        for (int it = 1; it <=3 ; it++) {
            System.out.println("IT : "+it);
            for (int qa = 1; qa <=3 ; qa++) {
                System.out.println("  QA : "+qa);
            }
        }

    }
}
