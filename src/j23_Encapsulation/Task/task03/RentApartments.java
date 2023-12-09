package j23_Encapsulation.Task.task03;

import java.util.Scanner;

public class RentApartments {
    Scanner input = new Scanner(System.in);
    private String name;
    private int roomCount;
    private boolean balconyOrNo;
    int daire;
    int fiyat = 1400;

    public void fatura() {
        System.out.println(fiyat);

    }

    public int hesap() {
        System.out.println("kaç numaralı daireyi istersiniz    1---2---3---4");
        int daire = input.nextInt();
        if (daire == 1) {

            System.out.println(fiyat);
            System.out.println("balkon istiyor musun");
            String balkon = input.next().toLowerCase().trim();
            if (balkon.equals("e")) {
                return this.fiyat = fiyat + 200;

            } else this.fiyat = fiyat;
            return this.fiyat;
        }
        if (daire == 2) {

           return 1700;
        }
        if (daire == 3) {

           return 2200;
        }
        if (daire == 4) {

          return  2700;


            }

        return fiyat;
    }

    public RentApartments() {

    }

    @Override
    public String toString() {
        return "RentApartments{" +
                "name='" + name + '\'' +
                ", roomCount=" + roomCount +
                ", balconyOrNo=" + balconyOrNo +
                ", daire=" + daire +hesap()+
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(int roomCount) {
        this.roomCount = roomCount;
    }

    public boolean isBalconyOrNo() {
        return balconyOrNo;
    }

    public void setBalconyOrNo(boolean balconyOrNo) {
        this.balconyOrNo = balconyOrNo;
    }
}


