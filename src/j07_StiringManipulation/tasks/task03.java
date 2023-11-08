package j07_StiringManipulation.tasks;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class task03 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Adınız :\n"+"Soyadınız :" );
        String adsoyad = input.nextLine();
        System.out.println("adınız : "+ adsoyad.substring(0,1).toUpperCase()+ adsoyad.substring(1,(adsoyad.indexOf(" "))).toLowerCase()
                +"\n" + "soyadınız : " +adsoyad.substring(adsoyad.indexOf(" ")+1,adsoyad.indexOf(" ")+2).toUpperCase()+
                adsoyad.substring(adsoyad.indexOf(" ")+2).toLowerCase());



    }
}
