package j25_Exceptions;

import java.util.logging.SocketHandler;

public class C03_ClasssCastingException {
    public static void main(String[] args) {

        Object obj = "javaCAN'lara selamkeee";
        System.out.println("obj = " + obj);//

        String str = (String) obj;// obj data type String str data type casting ile atandı
        System.out.println("str = " + str);//
        Object sayi = 49;
        //  String sayiStr = (String) sayi;// obj data type String sayiStr data type casting ile atandı->ClassCastException
        //  System.out.println("sayiStr = " + sayiStr);//
        try {
            String sayiStr = (String) sayi;
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (ClassCastException e) {
            System.out.println("Agam int data type String atanır mı ?");
            System.out.println("Agam  CATCH blok'dan selamkeee  bu cıktıyı okuduysan  try excp yakaladı  ");

        }
        System.out.println("   ***   ");
        try {
            String str1 = (String) str;
            System.out.println("Agam  TRY blok'dan selamkeee  bu cıktıyı okuduysan  try sorunsuz CATCH calısmaz");

        } catch (ClassCastException e) {
            System.out.println("Agam int data type String atanır mı ?");
            System.out.println("Agam  CATCH blok'dan selamkeee  bu cıktıyı okuduysan  try excp yakaladı  ");

        }

        System.out.println("Agam bu çıktıyı okuduysan app. gayet başarılı dewamkeee :)");//bu kod çalışmıssa pr sorunsuz kırılmadan run olmuştur



    }
}
