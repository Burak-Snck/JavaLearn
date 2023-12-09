package j20_StaticKeyword.Task.task003;

public class Runner {
    public static void main(String[] args) {


            Lesson mat = new Lesson("Matematik",3.2);
            Lesson trkc = new Lesson("Turkce",3.2);
            Lesson rsim = new Lesson("Resim",2.8);
            Lesson muzik = new Lesson("Muzik",2.9);


            Student st1=new Student("ALİ");
            st1.maxCredit=10;

            System.out.println("Sevgili ögrencimiz "+st1.name+" alabileceginiz maximun kredi = "+st1.maxCredit);
            st1.dersEkle(mat);
            st1.dersEkle(trkc);
            st1.dersEkle(rsim);
            st1.dersEkle(muzik);
            System.out.println("Secmis oldugunuz derslerin toplam kredisi = "+st1.toplamKredi());
            System.out.println("Secilen Dersler ve Kredileri "+st1.lessons);







    }


}
