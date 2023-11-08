package j06_Switch_Statement.tasks;

import java.util.Locale;
import java.util.Scanner;

public class task05 {
    public static void main(String[] args) {
// TASK-> Girilen haftanın gününü hafta içi veya sonu oldugunu print eden code create ediniz..

        Scanner input = new Scanner(System.in);
        System.out.println("bir gün gireriz");
        String gün = input.next().toLowerCase();
        switch (gün) {
            case "pazartesi":
            case "salı":
            case "çarşamba":
            case "perşembe":
            case "cuma":
                System.out.println("girilen gün haftaiçi");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("h sonu");
                break;
                default:
                    System.out.println("hatalı");


        }

    }
}
