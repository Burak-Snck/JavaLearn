package j14Varargs;

public class atask05 {
    public static void main(String[] args) {

 /*
        Task ->  girilen bir sayı ile girilen String'lerin en uzun harf sayısını çarpıp print eden METHOD create ediniz.
         */

        int sayi1 = 7;
        String str1 = "sefil javacı Haluk";//
        String str2 = "perfect javacı Abdulhamit";//
        String str3 = "beleştepe muhtarı CEREN";//

    enuzun(sayi1,str1, str2, str3);


    }

    private static void enuzun(int sayi1, String ...str) {
        int uzun=0;
        for ( String k:str  ) {
            if(k.length()>uzun){
                uzun=k.length();

            }

        }
        System.out.println(uzun);
        System.out.println(uzun*sayi1);


    }


}
