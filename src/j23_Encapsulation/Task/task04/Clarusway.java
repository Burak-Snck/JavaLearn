package j23_Encapsulation.Task.task04;

import java.util.ArrayList;
import java.util.List;

public class Clarusway {
    private String okulAd;
    private int maxOgrenciSayisi;
    public static ArrayList<It>list=new ArrayList<>();

    public Clarusway() {
    }


    public String getOkulAd() {
        return okulAd;
    }

    public void setOkulAd(String okulAd) {
        this.okulAd = okulAd;
    }

    public int getMaxOgrenciSayisi() {
        return maxOgrenciSayisi;
    }

    public void setMaxOgrenciSayisi(int maxOgrenciSayisi) {
        this.maxOgrenciSayisi = maxOgrenciSayisi;
    }

    @Override
    public String toString() {
        return
                "okulAd='" + okulAd + '\'' +
                        ", maxOgrenciSayisi=" + maxOgrenciSayisi +
                        ", list=" + list ;
    }
}
