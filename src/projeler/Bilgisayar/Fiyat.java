package projeler.Bilgisayar;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fiyat {
    Scanner scan = new Scanner(System.in);
    static List<Data> list = new ArrayList<>();
    static List<Integer> idList = new ArrayList<>();

    public void mainMenu() {
        System.out.println("*****Ana Menu******");
        try {
            System.out.println("Admin girisi icin - 1");
            System.out.println("Kullanici girisi icin - 2");
            System.out.println("Cikis icin - 3");
            System.out.print("Seciniz : ");
            int secim = scan.nextInt();
            for (int i = 0; i < 1; i++) {
                if (secim == 1) {
                    System.out.println("Kullanici adinizi giriniz : ");
                    String admin = scan.next();
                    String adminUser = "admin";
                    if (admin.equals(adminUser)) {
                        for (int j = 0; j < 1; j++) {
                            System.out.println("Sifrenizi giriniz : ");
                            String sifre = scan.next();
                            String adminPass = "admin01";
                            if (sifre.equals(adminPass)) {
                                System.out.println("Admin menuye yonlendiriliyorsunuz");
                                Thread.sleep(2000);
                                adminMenu();
                            } else {
                                System.out.println("Sifre yanlis");
                                j--;
                            }
                        }
                    } else {
                        System.out.println("Kullanici adi yanlis");
                        i--;
                    }
                } else if (secim==2) {
                    if (!list.isEmpty()){
                        printf();
                        System.out.println("Lutfen urun ID'si girerek bilgisayar seciniz");
                        int id=scan.nextInt();
                        if (idList.contains(id)){
                            int totalFiyat=getFiyat(id);
                            System.out.println("Toplam Fiyat : "+totalFiyat);
                            System.out.println("Indirimli Fiyat : "+getDiscountFiyat(totalFiyat,20));
                            System.out.println("Urun sepete eklenmistir");
                        }
                    }else System.out.println("Sitemiz bakimdadir yine bekleriz");
                } else if (secim==3) {
                    System.out.println("Cikis yapiyorsunuz Yine bekleriz");
                }else {
                    System.out.println("Hatali giris");
                    mainMenu();
                }
            }
        } catch (Exception e) {
            System.out.println("****Hatali Giris*********");
            scan.nextLine();
            mainMenu();
        }
    }

    private void adminMenu() {
        System.out.println("*** ADMİN MENÜSÜ ***");
        try {
            System.out.println("Bilgisayar eklemek için - 1");
            System.out.println("Bilgisayar silmek için - 2");
            System.out.println("Bilgisayarlari görüntülemek için - 3");
            System.out.println("Bilgisayar guncelleme - 4");
            System.out.println("Ana menüye dönmek icin - 5");
            System.out.println("Çıkış için - 6");
            System.out.print("Seçiniz : ");
            int secim = scan.nextInt();
            scan.nextLine();
            if (secim == 1) bilgisayarEkleme();
            else if (secim == 2) bilgisayarSilme();
            else if (secim == 3) bilgsayarlariGoruntule();
            else if ( secim == 4) bilgisayarGuncelleme();
            else if (secim == 5) mainMenu();
            else if (secim == 6) System.out.println("\nÇıkış yaptnız.");
            else {
                System.out.println("\nHatalı Giriş. Yeniden Deneyiniz.");
                adminMenu();
            }
        }catch (Exception e){
            System.out.println("****Hatali Giris*****");
            scan.nextLine();
            adminMenu();
        }
    }

    private void bilgisayarGuncelleme() {
        printf();
        System.out.println();
        System.out.println("Guncellemek istediginiz bilgisayarin ID'sini giriniz : ");
        int id=scan.nextInt();
        try {
            if (idList.contains(id)){
                System.out.print("Guncellemek istediğiniz bilgisayarin markasini giriniz : ");
                scan.nextLine();
                String marka = scan.nextLine();
                marka = marka.substring(0, 1).toUpperCase() + marka.substring(1).toLowerCase();
                System.out.print("Guncellemek istediğiniz bilgisayarin modelini giriniz : ");
                String model = scan.nextLine();
                model = model.substring(0, 1).toUpperCase() + model.substring(1).toLowerCase();
                System.out.print("Guncellemek istediğiniz bilgisayarin ram'ini giriniz : ");
                String ram = scan.next().toLowerCase();
                System.out.print("Guncellemek istediğiniz bilgisayarin cpu'sunu giriniz : ");
                String cpu = scan.next().toLowerCase();
                System.out.print("Guncellemek istediğiniz bilgisayarin boyutnu giriniz : ");
                String boyut = scan.next();
                boyut = boyut.substring(0, 1).toUpperCase() + boyut.substring(1).toLowerCase();
                System.out.print("Guncellemek istediğiniz bilgisayarin rengini giriniz : ");
                scan.nextLine();
                String color = scan.next();
                color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();
                Data data = new Data();
                data.setMarka(marka);
                data.setModel(model);
                data.setRam(ram);
                data.setCpu(cpu);
                data.setBoyut(boyut);
                data.setColor(color);
                int index = idList.indexOf(id);
                list.set(index,data);
                System.out.println("Bilgisayar basariyla guncellendi.\nAdmin menuye yonlendiriliyorsunuz");
                Thread.sleep(2000);
                adminMenu();
            }else {
                System.out.println(id+" numarali bilgisayar kayitli degil");
                adminMenu();
            }

        } catch (Exception e) {
            System.out.println("****Hatali Giris*****");
            scan.nextLine();
            adminMenu();
        }
    }

    private void bilgsayarlariGoruntule() {
        try {
            System.out.println("Bilgisayar listesi asagidadir\n");
            printf();
            System.out.println("Admin menuye yonlendiriliyorsunuz");
            Thread.sleep(2000);
            adminMenu();
        }catch (Exception e){
            System.out.println("****Hatali Giris*****");
            scan.nextLine();
            adminMenu();
        }

    }

    private void bilgisayarSilme() {
        printf();
        try {
            System.out.println("Lutfen silmek istediginiz urunun ID'sini giriniz : ");
            int id=scan.nextInt();
            if (idList.contains(id)){
                int index=idList.indexOf(id);
                Data data=list.remove(index);
                idList.remove(index);
                System.out.println(data+" Bilgisayari silindi\nAdmin menuye yonlendiriliyorsunuz");
                Thread.sleep(2000);
                adminMenu();
            }else {
                System.out.println(id+" numarali urun mevcut degil");
                adminMenu();
            }
        }catch (Exception e){
            System.out.println("****Hatali Giris*****");
            scan.nextLine();
            adminMenu();
        }
    }

    private void printf() {
        System.out.printf("%20s%20s%20s%20s%20s%20s%20s", "LaptopID", "Marka", "Model", "Ram", "CPU", "Boyut", "Color");
        System.out.println();
        for (int j = 0; j < list.size(); j++) {
            System.out.printf("%20s%20s%20s%20s%20s%20s%20s\n", idList.get(j), list.get(j).getMarka(),
                    list.get(j).getModel(), list.get(j).getRam(), list.get(j).getCpu(), list.get(j).getBoyut(), list.get(j).getColor());
        }
    }

    private void bilgisayarEkleme() {
        System.out.println();
        try {
            System.out.print("Eklemek istediğiniz bilgisayarin markasini giriniz : ");
            String marka = scan.nextLine();
            marka = marka.substring(0, 1).toUpperCase() + marka.substring(1).toLowerCase();
            System.out.print("Eklemek istediğiniz bilgisayarin modelini giriniz : ");
            String model = scan.nextLine();
            model = model.substring(0, 1).toUpperCase() + model.substring(1).toLowerCase();
            System.out.print("Eklemek istediğiniz bilgisayarin ram'ini giriniz : ");
            String ram = scan.next().toLowerCase();
            System.out.print("Eklemek istediğiniz bilgisayarin cpu'sunu giriniz : ");
            String cpu = scan.next().toLowerCase();
            System.out.print("Eklemek istediğiniz bilgisayarin boyutnu giriniz : ");
            String boyut = scan.next();
            boyut = boyut.substring(0, 1).toUpperCase() + boyut.substring(1).toLowerCase();
            System.out.print("Eklemek istediğiniz bilgisayarin rengini giriniz : ");
            scan.nextLine();
            String color = scan.next();
            color = color.substring(0, 1).toUpperCase() + color.substring(1).toLowerCase();

            Data data = new Data();
            data.setMarka(marka);
            data.setModel(model);
            data.setRam(ram);
            data.setCpu(cpu);
            data.setBoyut(boyut);
            data.setColor(color);
            list.add(data);
            int id = Data.laptoID++;
            idList.add(id);
            System.out.println("Bilgisayar basariyla kayit oldu.\nAdmin menuye yonlendiriliyorsunuz");
            Thread.sleep(2000);
            adminMenu();
        } catch (Exception e) {
            System.out.println("****Hatali Giris*****");
            scan.nextLine();
            adminMenu();
        }
    }
    private int getDiscountFiyat(int totalFiyat, int discount) {
        return totalFiyat-(totalFiyat*discount/100);
    }

    private int getFiyat(int id) {
        int index=idList.indexOf(id);
        Data bilgiData=list.get(index);
        Hesap hesap=new Hesap();
        return hesap.getRam(bilgiData.getRam())+hesap.getCPU(bilgiData.getCpu())+
                hesap.getColor(bilgiData.getColor())+hesap.getSize(bilgiData.getBoyut());
    }
}
