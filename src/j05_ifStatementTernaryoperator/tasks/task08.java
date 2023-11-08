package j05_ifStatementTernaryoperator.tasks;

public class task08 {
    public static void main(String[] args) {

         /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise String 1 is equal to String 2"" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        String str1="karaca";
        String str2="Karaca";


        if (str1.equalsIgnoreCase(str2)){
            System.out.println(" String 1 is equal to String 2");
        }else {
            System.out.println(" String 1 is not equal to String 2");
        }
    }
}
