package Denemesayfası.deneme1;

import java.util.ArrayList;

public class MeyveListesi {
    public static void main(String[] args) {
        // ArrayList oluşturma
        ArrayList<Meyve> meyveListesi = new ArrayList<>();

        // Meyve nesnelerini oluşturup ArrayList'e ekleme
        Meyve yanık= new Meyve("Elma","Almanya");


        meyveListesi.add(yanık);


        // ArrayList'teki meyve isimlerini yazdırma
        for (Meyve meyve : meyveListesi) {
            System.out.println(meyve.getIsim());
            System.out.println(meyve.getÜlke());
        }
    }
}
