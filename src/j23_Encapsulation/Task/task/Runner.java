package j23_Encapsulation.Task.task;

public class Runner {

    public static void main(String[] args) {
        Student s1=new Student("Haluk",48);

        s1.setAge(18);

        System.out.println(s1.getName() +" hoca hep "+ s1.getAge());
    }


}
