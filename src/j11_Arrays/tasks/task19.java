package j11_Arrays.tasks;

public class task19 {
    public static void main(String[] args) {


        //Task-> Asagidaki multi dimensional array'lerin ic array'lerinde ayni index'e sahip
        // elemanlarin toplamini ekrana yazdiran bir program yaziniz. (Zor soru)
        // arr1 = { {1,2}, {3,4,5}, {6} } ve
        // arr2 = { {7,8,9}, {10,11}, {12} }
        int[][] arr1 = { {1,2}, {3,4,5}, {6}};
        int[][] arr2 = { {7,8,9}, {10,11}, {12}};
        int toplam=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (i==j)
                    for (int k = 0; k < arr1[i].length; k++) {
                        for (int l = 0; l < arr2[j].length; l++) {
                            if (k == l) {
                                toplam=(arr1[i][k]+arr2[j][l]);
                                System.out.print(toplam+" ");
                            }
                        }
                    }
            }
        }
    }



}
