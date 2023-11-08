package j08_Loops.WhileLoops.Task;

//3 basanmaklı 4 ve 6 ya tam bölünen

public class task10 {
    public static void main(String[] args) {
        int sayi=1000;
        int sayaç=0;
        while(sayi>99){
            System.out.print(sayi%12==0?sayi+" ":"");

            sayi--;
        }

    }


}
