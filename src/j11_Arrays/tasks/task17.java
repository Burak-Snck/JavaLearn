package j11_Arrays.tasks;

public class task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyuk elemanı print eden code create ediniz...
        int[][] arr ={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int buyuk=arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]>buyuk){
                    buyuk=arr[i][j];
                }
            }
        }
        System.out.println("En buyuk = " + buyuk);

    }
}
