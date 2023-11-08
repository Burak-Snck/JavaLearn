package j03_ScannerClass_TypeCasting;

import java.util.Scanner;

public class C01_ScannerClass {


    public static void main(String[] args) {
//task aaaaaaaaaaaaaaa
        //1. adım
        Scanner input=new Scanner(System.in);

       //2. adım
        System.out.print(" kenar giriniz ");

        //3.adım kullanıcının girişişne uygun variable ata,,
        int kenaruzunluk=input.nextInt();

        System.out.println(" kenaruzunluk = " + kenaruzunluk);

        //4 kare alanı


        int karealan=kenaruzunluk*kenaruzunluk;
        System.out.println("karealan = " + karealan);

        /*
Task->
Kullanicinın  gunde içtiği  cay ve kullandığı  seker değerine göre
Bir yilda kac kg seker kullandigini hesaplayan bir code create ediniz...
1 seker = 1.7 gr
Ornek : Input : cay sayisi : 10 seker sayisi :
        Output : Yilda 12.41 kg seker kullaniyorsunuz
*/




                System.out.println("Cay sayisini giriniz ?");
                System.out.println("kac seker atiyorsun ?");
                int caysayisi= input.nextInt(); // kullanicidan gelen data integara atandi
                int sekersayisi= input.nextInt(); // kullanicidan gelen data integara at
                System.out.println("Toplam :"+ (caysayisi*sekersayisi*1.7*365)/1000);

    }
}
