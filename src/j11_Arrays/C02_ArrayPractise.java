package j11_Arrays;

import java.util.Arrays;

public class C02_ArrayPractise {
    public static void main(String[] args) {

        String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int sayiArr[] = {20, 32, 7, 58, 63, 59, 35, 17, 16, 21};
//Task01-> sayıArr cift index elemanlarını print eden code create ediniz
        for (int i = 0; i < sayiArr.length; i++) {
            if (i % 2 == 0) {
                System.out.print(sayiArr[i] + " ");//inddeksi çifti yazdırırır
            }
        }
       // for (int i = 0; i < sayiArr.length; i + 2) {
     //   }
        //System.out.println(sayiArr[i] + " ");
        //Task02-> isimArray de 5 karakterden fazla olan elemanları print eden code create ediniz
        for (int i = 0; i < isimArr.length; i++) {//array eleman sayısı kadar tekrar tanımlamdı
            if (isimArr[i].length() > 5) { //tekrardan gelen her bir array elemanı karekter saysısı büyük olma şartı tanımlandı

                System.out.println(isimArr[i]);

            }
        }

        //Task03-> isimArray de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz..
        System.out.println("   ***   task03   ***   ");
        int yeniArrElemansayısı=0;//yeniArr için eleman sayısı tanımlandı

        for(int i=0; i<isimArr.length; i++){

            if(isimArr[i].length()<6){
                yeniArrElemansayısı++;


            }

        }
        System.out.println(yeniArrElemansayısı);
        String yeniArr[] =new String[3];
        int yeniArrindeks=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6) {
                yeniArr[yeniArrindeks] = isimArr[i];
                yeniArrindeks++;
            }
        }

        // Yeni diziyi ekrana yazdır
        System.out.println(Arrays.toString(yeniArr));
    }
}
