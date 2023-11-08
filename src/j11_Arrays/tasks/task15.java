package j11_Arrays.tasks;

public class task15 {
    public static void main(String[] args) {
        //task-> arr  tum elemalarının çarpımını print eden code create edinz
        int[][] arr ={
                {3,5},//0. kat
                {2,4,1},//1. kat
                {6,1,2,2},//2. kat
        };
        int carpim=1;
        for (int kat = 0; kat < arr.length; kat++) {
            for (int daire = 0; daire < arr[kat].length; daire++) {
                carpim*=arr[kat][daire];
            }
        }
        System.out.println("carpim = " + carpim);
    }
}
