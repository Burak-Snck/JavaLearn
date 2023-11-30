package j20_StaticKeyword.Task.task03;

import java.util.ArrayList;
import java.util.List;

public class StudentClass {
    String name;
    int maxCredit;
    List<LessonClass> lessons;

    public StudentClass(String name) {
        this.name = name;
        this.lessons = new ArrayList<>();
    }

    public void dersEkle(LessonClass les) {
        int tplmKrdi=toplamKredi();

        if (tplmKrdi + les.credit <= maxCredit) {
            lessons.add(les);
            System.out.println(les.credit + " kredilik " + les.lessonName + " dersi listenize eklenmistir");

        } else {
            System.out.println("Max credi miktarini astiginiz icin " + les.lessonName + " dersini alamazsiniz.");
        }

    }

    public int toplamKredi(){
        int tplmKrdi=0;
        for (LessonClass w:lessons) {
            tplmKrdi+= w.credit;
        }
        return tplmKrdi;
    }
    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                        ", maxCredit=" + maxCredit +
                        ", lessons=" + lessons;
    }

}
