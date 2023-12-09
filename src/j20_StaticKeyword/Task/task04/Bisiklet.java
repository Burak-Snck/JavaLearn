package j20_StaticKeyword.Task.task04;

import java.util.Scanner;

public class Bisiklet {
    Scanner input = new Scanner(System.in);
    int hiz;
    int vites;

    public Bisiklet(int hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    @Override
    public String toString() {
        return "Bisiklet{" +
                "hiz=" + hiz +
                ", vites=" + vites +
                '}';
    }

    public void işlemmenüsü(){

        System.out.println("lütfen bir işlem seçiniz durumgöster 0 vites arttır --1 , vitez azalt 2 hız değiştir 3  çıkış 4");
      int  secim= input.nextInt();
       if(secim==0){
           durumgöster();
        }
        if (secim==1){
            vitesarttır();
        }
        else if (secim==2){
            vitesazalt();
        }else if (secim==3){
            hızdeğiştir(input.nextInt());
        }else if (secim==4){
            çıkış();
        }


    }
    public  void durumgöster(){

        System.out.println(hiz +" " + vites);
        işlemmenüsü();

    }
    public void  vitesarttır(){
        if(vites<5){
            vites++;
        }else System.out.println("vites maks 5 olur şu an 5. vitesdesiniz");

        durumgöster();
    }

    public void  vitesazalt(){
        if(vites>1){
            vites--;

        }else System.out.println("vites min 1 daha fazla azaltılamaz");
       durumgöster();

    }

    public void hızdeğiştir(int yenihız){
        System.out.println("şu an ki hızınız " + hiz + " hızınız kaç olsun ");
        yenihız=input.nextInt();
        this.hiz=yenihız;
        durumgöster();


    }
    public void çıkış(){
        System.out.println("çıkış yaptınız");
    }

}
