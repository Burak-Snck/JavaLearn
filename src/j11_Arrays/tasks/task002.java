package j11_Arrays.tasks;

import java.util.Arrays;
import java.util.Scanner;

public class task002 {
    //task-> girilen int array elemanları toplamını print eden code create ediniz.
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        int toplam=0;

        System.out.println("kaç boyutlu olsun");
        int boyut=input.nextInt();
        int Arr[]=new int[boyut];
        for(int i=0;i<Arr.length;i++){
            System.out.println(i+"inciyi gir");
            Arr[i]=input.nextInt();

        }
        System.out.println(Arrays.toString(Arr));
        for(int i=0;i<Arr.length;i++){
            toplam+=Arr[i];
        }
        System.out.println(toplam);
    }

}
