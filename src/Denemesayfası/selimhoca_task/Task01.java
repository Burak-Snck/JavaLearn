package challenge06;

import java.util.Scanner;

public class Task01 {
    /* Task->
     * girilen String icinde "xyz" dizimi var ise true degilse false return eden metod create ediniz.
     *
     * input      output
     * axyzm  ==   true
     * xyz    ==   true
     * x.yz   ==   false
     * xyaz   ==   false
     */


    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("String gir");
        String str=input.nextLine();
        gorev1(str);


    }

    private static void gorev1(String str) {
        String yenigorev= str.contains("xyz") ? "true" : "false";
        System.out.println(yenigorev);

    }

}
