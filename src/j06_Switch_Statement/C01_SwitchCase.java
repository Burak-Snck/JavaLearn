package j06_Switch_Statement;

import java.util.Scanner;

public class C01_SwitchCase {

/*
    Switch-Case yapısı  if statement'e benzer action alır.
    Çok sayida if statement bloklari code okunabilirliği ve clean code olarak tavsiye edilmez. Bir app actionda sabit bir degeri
    çoklu durum ile karsilastirmak için switch-case blok kullanılır. Switch-case blok'da  degiskene göre bir
    çok durumdan değişkene uyan durum gerçeklesir.
    if statement blok ile  switch-case blok birlikte tanımlanabiir.
    çoklu koşul içeren durumlarda switch-case blok if statement'e göre app. hızı açısından daha avantajlıdır.(Best Practice)
     Switch-Case ile if statement arasında önemli bir performans farklılığı yoktur.

      ahan da CISSS TRICK-> Switch Statement'de long,double,float ve boolean asla KULLANILMAZZZ..
      Switch de sadece int, byte, short, char, String data type  kullanilabilir
      Eger 3 den fazla durum varsa switch() tercih edilir.
 */



    public static void main(String[] args) {

        // Task-> verilen bir rakamın harf karakteri ile print eden code create ediniz
         Scanner input = new Scanner(System.in);
        System.out.println("bir rakam  gir");
        int rakam= input.nextInt();


    // if (rakam==0){
    //     System.out.println("sıfır");
    // } if (rakam==1){
    //     System.out.println("bir");
    // } if (rakam==2){
    //     System.out.println("iki");
    // } if (rakam==3){
    //     System.out.println("üç");
    // } if (rakam==4){
    //     System.out.println("dört");
    // } if (rakam==5){
    //     System.out.println("beş");
    // } if (rakam==6){
    //     System.out.println("altı");
    // } if (rakam==7){
    //     System.out.println("yedi");
    // } if (rakam==8){
    //     System.out.println("sekiz");
    // } if (rakam==9){
    //     System.out.println("dokuz");
    // } else {
    //     System.out.println("doğru  gir");
    // }

 // SWİTCH


        switch (rakam) {
            case 0:
                System.out.println("sıfır");
                break;
            case 1:
                System.out.println("bir");
                break;
            case 2:
                System.out.println("iki");
                break;
            case 3:
                System.out.println("üç");
                break;
            case 4:
                System.out.println("dört");
                break;
            case 5:
                System.out.println("beş");
                break;
            case 6:
                    System.out.println("altı");
                break;
            case 7:
                    System.out.println("yedi");
                break;
            case 8:
                System.out.println("sekiz");
                break;
            case 9:
                System.out.println("dokuz");
                break;
            default: // hir biri çalışmazsa default çalışır
                System.out.println("yanlış girdiniz");

        }

    }

}
