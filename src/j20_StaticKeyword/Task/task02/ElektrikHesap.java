package j20_StaticKeyword.Task.task02;

public class ElektrikHesap {
    int toplamTuketim;
    double  oran=0.7;
    double fatura;

    public void tüketimEkle(int tuketim){
        toplamTuketim+=tuketim;

    }
    public double odenecekTutar(){
        fatura=oran*toplamTuketim;
        return fatura;
    }



}
