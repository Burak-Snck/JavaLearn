package j23_Encapsulation.Task.task02;

import java.time.LocalDate;
import java.time.Period;

public class employees {

    private String name;
    private int salary;
    private  int dob;

    @Override
    public String toString() {
        return "employees{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", dob='" + dob + '\'' +
                '}';
    }

    public employees() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getDob() {
     return  dob;


    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public void calculateaga() {

     if(dob>18){
         System.out.println("Welcome to our company Fernando your salary is" +  getSalary());

     }
     if(dob==18){
         System.out.println(" we can have inter with you after that you can have");

     }
     if(dob<18){
         System.out.println(" come back when you are 18 years old");

     }


    }
}