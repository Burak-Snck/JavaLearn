package j06_Switch_Statement.tasks;
import java.util.Scanner;

public class task02_ {

    // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...
    public static void main(String[] args) {
        // Task-> Girilen ay numarasına göre kaç gün çektiğini print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.println("ay no gir");
        int ay=input.nextInt();
        switch (ay){
            case 1:
            case 3:
            case 5:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 çeker");
                break;
            case 11:
            case 9:
            case 6:
                System.out.println("30 çeker ay");
                break;
            case 2:
                System.out.println( "YIL GİR");
                int yıl = input.nextInt();
                if (yıl % 4==0) {
                    System.out.println("29 çeker");
                } else {
                    System.out.println("28 çeker");
                }
            }

        }
    }

