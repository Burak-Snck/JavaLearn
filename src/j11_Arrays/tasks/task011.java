package j11_Arrays.tasks;

import java.util.Arrays;

public class task011 {
    public static void main(String[] args) {

         /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup print eden code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int toplamdolar = 0;
        int toplampound = 0;
        String arr[] = str.split(" ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                toplamdolar += Integer.parseInt(arr[i].replace("$", ""));
            } else {
                toplampound += Integer.parseInt(arr[i].replace("£", ""));
            }

        }

        System.out.println(toplamdolar);
        System.out.println(toplampound);
    }
}
