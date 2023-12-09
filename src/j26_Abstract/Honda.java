package j26_Abstract;

public abstract class Honda {// abstract parent class
     abstract void kapı();


    public abstract void motor();// abs metot  body siz implement zorunlu meth
    void sunroof (){// concrete meth body li call edilebilir

        System.out.println("sanruf yaz daha iyi ");

    }
    abstract void koltuk();//abs metot  body siz implement zorunlu meth
    // abs class da concreate variable tanım lanabilir
    String isim="Seçkin";
    // pekiii abs class da abs variable tanımlanır mı hayır tanımlanmaz
   //abstract String str="javanur";
  //  final void finalMethod();//tanımlanamaz body siz ----
   // final  abstract   void finalMethod();final abs meth tanımlanmaz
   // private abstract void privateMeth();tanınlanmaz

   // static void gunesMeth(); static concreate meth bodysiz olamaz
    // static abstract void gunesMETH(); olamaz

    //Honda h1_new Honda();//ABSTRACT CLASS obje üretmez  melek doğurmaz


}

