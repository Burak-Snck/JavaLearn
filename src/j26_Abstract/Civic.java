package j26_Abstract;

public class Civic extends Lastik{

// concreat// class da abs.meth tanımlanır mı hayırrr


// TRİCK -> child concrete class parent abs class'ın abs methodlarını mutlaka implement override etmeli





  //  public abstract void asMeth();



    @Override
    public void lastikEbat() {

    }

    @Override
    void kapı() {
        System.out.println("kapılar akapansın");
    }

    @Override
    public void motor() {

    }

    @Override
    void koltuk() {

    }
    //POLYMORPHİSİM -- OBJ ÇOK BİÇİMLİLİK   FARKLI DATA TYPE BELİRLENMESİ
   // Civic c1=new Civic();
  //  Honda c2=new Civic();//Honda abs parent class data type obj

}
