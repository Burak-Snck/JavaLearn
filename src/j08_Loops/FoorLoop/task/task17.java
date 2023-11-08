package j08_Loops.FoorLoop.task;

public class task17 {
    public static void main(String[] args) {


        int harf=65;
        for (int kat = 0; kat <= 5; kat++) {//kat tekrarı
            for (int daire = 0; daire <= kat; daire++) {//daire tekrar
                System.out.print((char) (harf+daire)+" ");
            }
            System.out.println();//dummy
        }






    }
}
