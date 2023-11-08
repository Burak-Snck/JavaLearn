package j06_Switch_Statement.tasks;
import java.util.Scanner;

public class task03 {


    public static void main(String[] args) {

// Task-> Girilen ay numarasına göre  mevsimini print eden code create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.println("ay no gir");
        int ay=input.nextInt();
        switch (ay){
            case 1:
            case 2:
            case 12:
                System.out.println("girilen ay ocak");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("girilen ay ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("girilen ay yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("girilen ay sonbahar");
             break;
            default:
                 System.out.println("Hatalı Giriş");



            }
        System.out.println("devam et");

        }
    }

