package j08_Loops.FoorLoop.task;

import java.util.Scanner;

public class task04 {
    /*
          TASK  :
          Bir String içindeki tüm karakterleri en fazla bir kez print eden code create ediniz.
          Test Data:
          input: "aabbcccccddddaaa"
          output: abcd
       */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("kelime gir : ");
        String str = input.next();
        String yenistr=" ";

        for (int i=0; i<str.length()-1; i++) {

            Character dupl=str.charAt(i);
            if(yenistr.indexOf(dupl)==-1) {
                yenistr+=dupl;
            }
            System.out.println(yenistr);
        }


    }
}
