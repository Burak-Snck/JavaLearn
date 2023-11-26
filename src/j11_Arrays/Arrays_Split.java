package j11_Arrays;

import java.util.Arrays;

public class Arrays_Split {
    public static void main(String[] args) {
        //Spilit String data typelearı Arrayse eleman olarak çevirmek için kullan

        String str="javaNAZ'lara bolcana selamke,taskları çözmeyenin klavyesi bozulsun,ekranı mavi çalsın";
        //task  str nin kelime ve harf sayısını print eden kod create ediniz
        String strArr[]=str.split(" ");//str " "göre parçalanıpeleman olarak atandı

        System.out.println(str);
        System.out.println(Arrays.toString(strArr));
        System.out.println(strArr.length);//str nin eleman sayısı
        String harfArr[]=str.replaceAll("a","ggggg").split(" ");
        System.out.println(Arrays.toString( harfArr));

    }
}
