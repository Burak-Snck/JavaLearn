package j11_Arrays.tasks;

public class task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str="ade1r4d3";
        String[] arr=str.split("");
        int toplam=0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))){
                toplam+=Integer.parseInt(arr[i]);
            }
        }
        System.out.println("toplam = " + toplam);
        //2.yol
        System.out.println("2.yol");
        str=str.replaceAll("[^0-9]","");
        int toplam1=0;
        for (int i = 0; i < str.length(); i++) {
            toplam1+=Integer.parseInt(str.substring(i,i+1));
        }
        System.out.println("toplam1 = " + toplam1);
    }
}
