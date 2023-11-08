package j05_ifStatementTernaryoperator;

public class C01_ifStatement {

    public static void main(String[] args) {

        /*

        1. if-else belişrli bir şartla çalışmasını şarta bağlar

         */
        int abdyas=30;
        int canyas=35;

        if (abdyas==canyas){
            System.out.println("kardeşler");
        }
        System.out.println("dewamke");

      if (abdyas+canyas>60) System.out.println("tek satırda sülü olmayabilir");

      // if bloktan sonra süsslü kullanılmaz ise ilk satır veya komut if gibi çalışır diğerleri if den bağımsız olur


    }
}
