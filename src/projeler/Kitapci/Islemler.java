package projeler.Kitapci;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Islemler {
    static String c_RESET = "\u001B[0m";
    static String BOLD = "\033[0;1m";
    static String c_BLUE = "\u001B[34m";
    static String c_RED = "\u001B[31m";
    static String c_GREEN = "\u001B[32m";
    static String c_CYAN = "\u001B[36m";
    static String c_PURPLE = "\u001B[35m";
    static Scanner scan = new Scanner(System.in);
    static List<Kitap> kitapList=new ArrayList<>();
    static List<Integer> kitapNoList=new ArrayList<>();
    static int kitapNo = 999;

    Menuler menu=new Menuler();
    public void bookAdding() throws InterruptedException {
        kitapNo++;
        System.out.println("Eklemek istediginiz kitabin adini giriniz");
        String name=TryCatch.stringGiris();
        System.out.println("Eklemek istediginiz kitabin yazarini giriniz");
        String yazar=TryCatch.stringGiris();
        System.out.println("Eklemek istediginiz kitabin fiyatini giriniz");
        int fiyat=TryCatch.intGiris();
        Kitap kitap=new Kitap();
        kitapList.add(kitap);
        kitapNoList.add(kitapNo);
        System.out.println(BOLD+c_CYAN+"Kitap basariyla eklendi"+c_RESET);
        Thread.sleep(2000);
        menu.anaMenu();
    }

    public void bookSearching() throws InterruptedException {
        System.out.println("\nKitap no ile görüntülemek için 1'e ");
        System.out.println("Kitap adı ile görüntülemek için 2'e ");
        System.out.print("Seçiniz : ");
        int secim = TryCatch.intGiris();
        if (secim==1){
            System.out.println("\nGoruntulemek istediginiz kitabin numarasini giriniz");
            int no=TryCatch.intGiris();
            if (kitapNoList.contains(no)){
                int index=kitapNoList.indexOf(no);
                System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat" + c_RESET);
                System.out.println();
                System.out.printf("%20s%20s%20s%16s\n", no, kitapList.get(index).getName(),
                        kitapList.get(index).getYazar(), kitapList.get(index).getFiyat());
            }else {
                System.out.println(BOLD+c_RED+"\nBu numarada bir kitap kayitli degil");
                bookSearching();
            }
            Thread.sleep(2000);
            menu.anaMenu();
        } else if (secim==2) {
            System.out.println("\nGoruntulemek istediginiz kitabin ismini giriniz");
            String isim=TryCatch.stringGiris();
            int count=0;
            for (Kitap val:kitapList) {
                if (val.getName().equalsIgnoreCase(isim)){
                    int index=kitapList.indexOf(val);
                    System.out.println();
                    System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat\n" + c_RESET);
                    System.out.printf("%20s%20s%20s%16s", kitapNoList.get(index), val.getName(),
                            val.getYazar(), val.getFiyat());
                    System.out.println("\n");
                    Thread.sleep(2000);
                    menu.anaMenu();
                }else {
                    count++;
                }
            }
            if (count==kitapList.size()){
                System.out.println(BOLD+c_RED+"\nBu isimde bir kitap kayitli degil"+c_RESET);
                bookSearching();
            }
        }else {
            System.out.println("\nHatali giris tekrar deneyiniz");
            bookSearching();
        }
    }

    public void bookDeleting() throws InterruptedException {
        System.out.println("\nSilmek istediginiz kitabin numarasini giriniz");
        int no=TryCatch.intGiris();
        if (kitapNoList.contains(no)){
            int index=kitapNoList.indexOf(no);
            Kitap kitap=kitapList.remove(index);
            kitapNoList.remove(index);
            System.out.println(BOLD+c_CYAN+kitap.getName()+" kitabi silindi "+c_RESET);
            Thread.sleep(2000);
            menu.anaMenu();
        }else {
            System.out.println(BOLD+c_RED+"\nBoyle bir kitap kayitli degil");
            bookDeleting();
        }
    }

    public void bookListing() throws InterruptedException {
        if (!kitapList.isEmpty()){
            System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%20s", "Kitap No", "Kitap Adı", "Yazar", "Fiyat\n" + c_RESET);
            System.out.println();
            for (Kitap val:kitapList) {
                int index=kitapList.indexOf(val);
                int kitapNo=kitapNoList.get(index);
                String name=val.getName();
                String yazar= val.getYazar();
                String fiyat= val.getFiyat();
                System.out.printf(BOLD + c_BLUE + "%20s%20s%20s%16s", kitapNo, name, yazar, fiyat + c_RESET);
                System.out.println();
            }
        }else System.out.println(BOLD+c_RED+"\nGoruntulenecek kitap yoktur"+c_RESET);
        Thread.sleep(2000);
        menu.anaMenu();
    }

    public void cikis() {
        System.out.println(BOLD+c_GREEN+"\nCikis yapiyorsunuz. Iyi gunler dileriz..."+c_RESET);
    }

}
