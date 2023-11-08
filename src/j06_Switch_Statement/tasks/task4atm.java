package j06_Switch_Statement.tasks;

import java.util.Scanner;

public class task4atm {
    public static void main(String[] args) {



        /*
TaskATM-> Bakıye 1000$ olan bir banka hesabı için bakıye öğrenme-para çekme-para yatırma
 ve çıkış işlemlerinin yapıldığı bir ATM app. create ediniz
 */

        Scanner input = new Scanner(System.in);
        int bakiye =1000;
        System.out.println("tercih gir : \nbakiye için 1\n yatırma için 2 \n para çekme 3 \n çıkış 4 ");
        int tercih = input.nextInt();
        switch (tercih) {
            case 1:
                System.out.println(bakiye);


                break;
            case 2:
                System.out.println("ne kadar yatırmak isttiyorsun");
                int yatanmiktar= input.nextInt();
                bakiye+=yatanmiktar;
                System.out.println("yatırma başarı ile gerçekleşti yeni bakiye : "+ bakiye);
                break;
            case 3:

                System.out.println("ne kadar çekmek istersiniz");
                int çekme= input.nextInt();
                if (çekme<=bakiye){
                    bakiye-=çekme;
                    System.out.println("çekme başarı ile gerçekleşti");
                }else{
                    System.out.println("bakiye yetersiz");
                }

                break;
            case 4:
                System.out.println("yeniden bekleriz");
                break;
            default:
                System.out.println("bi daha gir");
        }


    }
}
