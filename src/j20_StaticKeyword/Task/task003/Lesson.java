package j20_StaticKeyword.Task.task003;

public class Lesson {
    String lessonName;
    double credit;

    public Lesson(String name, Double credit) {
        this.lessonName = name;

        if(credit >1 || credit <100){
            this.credit=credit;
        }else System.out.println("kredi 1-10 arası olmalı");

    }

    @Override
    public String toString() {
        return
                 lessonName + '\'' +
                credit ;

    }
}
