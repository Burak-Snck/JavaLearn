package j12_ArraysList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task002 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Integer> notlist = new ArrayList<>();
        System.out.println("notlari giriniz bittiginde o'a basiniz");

        while (true) {
            int not = input.nextInt();
            if (not == 0) {
                break;
            }
            notlist.add(not);
        }
        System.out.println(notlist);

        System.out.println(gecenOgrenciBul(notlist));

    }

    private static int gecenOgrenciBul(List<Integer> notlist) {
        int toplam = 0;
        int count = 0;
        for (int w : notlist) {
            toplam += w;
        }
        int ortalama = toplam / notlist.size();
        for (int w : notlist) {
            if (w > ortalama) count++;


        }
        return count;
    }

}

