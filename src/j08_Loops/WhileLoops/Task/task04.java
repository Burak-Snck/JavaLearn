package j08_Loops.WhileLoops.Task;

public class task04 {

    public static void main(String[] args) {


        /*
		task->  3 basamakli 4 ve 6 ya tam bolunebilen tam sayilari buyukten kucuge ve kaç tane oldugunu print eden code create ediniz.

		 */
  int sayac=0;
  int sayi=100;

        while (sayi <= 999) {
            if (sayi % 12 == 0) {
                System.out.println(sayi);
                sayac++;
            }
            sayi++;





        }
        System.out.println(sayac + " adet sayı bulundu.");
    }

}
