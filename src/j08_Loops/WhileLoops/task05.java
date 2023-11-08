package j08_Loops.WhileLoops;

import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {

        // task05->girilen ifadeyi tersten print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.print("Tersten yazmak istediginiz bir ifade giriniz: ");
        String line = scanner.nextLine();
      // int basla5 = line.length()-1;
      // String str0 = "";
      // while (basla5>=0){
      //     str0 += line.charAt(basla5);
      //     basla5--;
      // }
      // System.out.print("Girilen ifadenin tersi: "+str0);
      //

    int hrfsys=line.length();
    while (hrfsys>0){
        System.out.print(line.charAt(hrfsys-1));
        hrfsys--;
    }

    }
}
