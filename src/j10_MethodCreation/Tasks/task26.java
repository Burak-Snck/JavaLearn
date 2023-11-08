package j10_MethodCreation.Tasks;

import java.util.Scanner;

public class task26 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile
    public static void main(String[] args) {
        // task-> Girilen bir ifadenin tekrarlı karakterleri yalnızca 1 kez print eden METHOD create ediniz
        // input-> javacanlara selam olsun
        // output-> javcnlr semou
        System.out.println("bir metin giriniz");
        String str=input.nextLine();
        gorev(str);





    }//main sonu

    private static void gorev(String str) {
        String tekli="";
        for (int i=0; i<(str.length()); i++) {


            char c = str.charAt(i);
            if (tekli.indexOf(c)==-1) {

                tekli+=c;
            }



        }
        System.out.println(tekli);
    }

        /* ***********
        2. yol

yeniStringVer(metinAl());
​
    }//main sonu
​
    public static String metinAl(){
        System.out.println("bir ifade giriniz");
        String str=input.nextLine();
        return str;
​
    }
​
    private static void yeniStringVer(String str) {
        String cikti="";
        for(int i=0;i<str.length();i++){
            if (!(cikti.contains(str.substring(i,i+1)))){
                cikti+=str.substring(i,i+1);
            }
        }
        System.out.println("cikti = " + cikti);
    }



    */
}



