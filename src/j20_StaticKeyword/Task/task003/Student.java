package j20_StaticKeyword.Task.task003;

import java.util.ArrayList;
import java.util.List;

public class Student {
    String name;
    int maxCredit;
    List<Lesson> lessons;

    public Student(String name) {
        this.name = name;
        this.lessons = new ArrayList<>();
    }

    public void dersEkle(Lesson les) {
        int tplmKrdi=toplamKredi();

        if (tplmKrdi + les.credit <= maxCredit) {
            lessons.add(les);
            System.out.println(les.credit + " kredilik " + les.lessonName + " dersi listenize eklenmistir");

        } else {
            System.out.println("Max credi miktarini astiginiz icin " + les.lessonName + " dersini alamazsiniz.");
        }

    }

    public int toplamKredi(){
        int tplmKrd=0;
        for (Lesson w:lessons) {
            tplmKrd+= w.credit;
        }
        return tplmKrd;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", maxCredit=" + maxCredit +
                        ", lessons=" + lessons;
    }

}
