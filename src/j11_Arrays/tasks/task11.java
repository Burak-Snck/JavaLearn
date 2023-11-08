package j11_Arrays.tasks;

import java.util.Arrays;

public class task11 {

    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 20€ 30€ 45€ £2 £65 £4 ";
        int dolarToplam=0;
        int sterlinToplam=0;
        int digerToplam=0;
        String[] arr=str.split(" ");
        System.out.println("String arr=" + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")){
                dolarToplam+=Integer.parseInt(arr[i].replace("$",""));
            }else if (arr[i].contains("£")){
                sterlinToplam+=Integer.parseInt(arr[i].replace("£",""));
            }else {
                digerToplam+=Integer.parseInt(arr[i].replace("€",""));
            }
        }
        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("sterlinToplam = " + sterlinToplam);
        System.out.println("digerToplam = " + digerToplam);

    }

}
