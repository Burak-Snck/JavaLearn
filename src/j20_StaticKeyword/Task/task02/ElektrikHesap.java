package j20_StaticKeyword.Task.task02;

public class ElektrikHesap {
   double toplamtüketim;
     double oran=0.7;
     double fatura;

   double tuketimekle(int x) {
  return toplamtüketim+=x;
    }
 double odenecektutar(){

     return toplamtüketim * oran;


    }



}
