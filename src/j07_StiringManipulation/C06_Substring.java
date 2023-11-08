package j07_StiringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {

          /*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune  String olarak ulaşılmak istenebilir..
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> exclusive/haric
 */

        String str="madem geldin dünyayaj ";
        System.out.println(str.substring(10));
        // son 10 karakter
      // System.out.println(str.substring(str.length() - 10));
      // System.out.println(str.substring(0,10));
      // System.out.println(str.charAt(4));
      // System.out.println(str.substring(str.length() - 2));
// task-> girilen 4 harfli bir kelimenin tersten print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("4 harfli gir");
        String str1=input.nextLine();
      //  System.out.println(str2.substring(str2.length() -1) + (str2.substring(str2.length() -2)+
        //        (str2.substring(str2.length() -3)+ (str2.substring(str2.length() -4)));

        System.out.println(str1.substring(str1.length() - 1) + str1.substring(str1.length() - 2) +
                str1.substring(str1.length() - 3) + str1.substring(str1.length() - 4));
    }
}
