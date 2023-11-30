package j20_StaticKeyword.Task.task03;

public class LessonClass {  String lessonName;
    int credit;


    public LessonClass(String lessonName, int credit) {
        this.lessonName = lessonName;
        if (credit <= 10 && credit >= 1) {

            this.credit = credit;
        } else {
            System.out.println("Lutfen 1 ile 10 arasi bir deger giriniz");

        }
    }

    @Override
    public String toString() {
        return
                "lessonName='" + lessonName + '\'' +
                        ", credit=" + credit;
    }
}
