package j26_Abstract.Task.Task02;
  abstract  class Calculator  {
 abstract int calculating(int x ,int y);


}


class Sum extends Calculator {


    @Override
    int calculating(int x, int y) {
        return x+y;
    }
}
class Divide extends Calculator {

    @Override
    int calculating(int x, int y) {
        return x/y;
    }
}

class Multiply extends Calculator {


    @Override
    int calculating(int x, int y) {
        return x*y;
    }
}

class Substract extends Calculator {

    @Override
    int calculating(int x, int y) {
        return x-y;
    }
    public static class main {
        public static void main(String[] args) {
        Sum s=new Sum();
            System.out.println("s.calculating(12,4) = " + s.calculating(12, 4));
        Divide a=new Divide();
            System.out.println("a.calculating(12,4) = " + a.calculating(12, 4));
        Multiply d=new Multiply();
            System.out.println("d.calculating(12,4) = " + d.calculating(12, 4));
       Substract k = new Substract();
            System.out.println("k.calculating(12,4) = " + k.calculating(12, 4));
        }

    }
}



 /*
     6 class oluşturuldu. Calculator, Sum, Divide, Multiply , Substract , Main

    Calculator'ı a super class yap.

    super class'ın içinde;
    calculating adında bir abstract method oluturunuz.
            Burada iki tane int parametresi vardır.
             return tipi int'dir.

    Sum class'ın içinde;
            Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
            iki parametreyi topla ve sonucu return et.

    Divide class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi böl ve sonucu return et.

    Multiply class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi çarp ve sonucu return et.

    Substract class'ının içinde,
             Calculator class'ına extend et.. (uzat, bağla)
            super class'ın içindeki calculating methodunu Override et.
             iki parametreyi birbirinden çıkart ve sonucu return et.

    Main class'ın içinde
             scanner object oluşturunuz.
             iki int oluştur ve bu iki int değişkenine scanner ata.

    Sum methodu çağır ve sonucu yazdır.
    Divide methodu çağır ve sonucu yazdır.
    Multiply methodu çağır ve sonucu yazdır.
    Substract methodu çağır ve sonucu yazdır.
     */