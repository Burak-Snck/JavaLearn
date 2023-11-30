package j20_StaticKeyword.Task.task03;

public class LessonRunner {

    public static void main(String[] args) {
        LessonClass mat = new LessonClass("Matematik",3);
        LessonClass trkc = new LessonClass("Turkce",3);
        LessonClass rsim = new LessonClass("Resim",2);
        LessonClass muzik = new LessonClass("Muzik",2);


        StudentClass st1=new StudentClass("Ayse");
        st1.maxCredit=10;

        System.out.println("Sevgili ögrencimiz "+st1.name+" alabileceginiz maximun kredi = "+st1.maxCredit);
        st1.dersEkle(mat);
        st1.dersEkle(trkc);
        st1.dersEkle(rsim);
        st1.dersEkle(muzik);
        System.out.println("Secmis oldugunuz derslerin toplam kredisi = "+st1.toplamKredi());
        System.out.println("Secilen Dersler ve Kredileri "+st1.lessons);

        System.out.println("*********************************");


        StudentClass st2=new StudentClass("Elif");
        st2.maxCredit=5;
        System.out.println("Sevgili ögrencimiz "+st2.name+" alabileceginiz maximun kredi = "+st2.maxCredit);

        st2.dersEkle(mat);
        st2.dersEkle(trkc);
        st2.dersEkle(rsim);
        st2.dersEkle(muzik);
        System.out.println("Secmis oldugunuz derslerin toplam kredisi = "+st2.toplamKredi());
        System.out.println("Secilen Dersler ve Kredileri "+st2.lessons);


    }

}
