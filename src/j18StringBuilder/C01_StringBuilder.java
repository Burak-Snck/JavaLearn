package j18StringBuilder;

import java.time.LocalTime;

public class C01_StringBuilder {
    public static void main(String[] args) {

         /*
   String = > daha yavas ,Immutable==> degismez,
   String'lerde method kullanarak String'i degistirmek atama yapmadan mumkun degildir.
​
    1) Java pass-by-value kullanir. -> makyaj dublor
    2) String Class'i immutable Class'dir. meth datayı değişmez
​
    StringBuffer =mutable==>degisebilir,less efficient/ daha yavas ,
    StringBuffer synchronized,thread safe.
​
   StringBuilders = mutable==>degisebilir ,
   not senkronized/not thread safe,fakat more efficient(daha etkili,ve hizli )
​
   1) String Class'i immutable(Degistirilemez)dir. Java mutable Stringler uretebilmemiz icin
      StringBuilder isimli bir class uretmistir.
   2) Java'da StringBuilder ile hemen hemen ayni isi yapan bir de StringBuffer classi vardir.
      "StringBuffer" Class'i StringBuilder Class'indan daha once uretilmistir.
      "StringBuffer" yavas calisan bir class'dir, "StringBuilder" ise hizli calisir.
      "StringBuffer"  "synchronize" islemlerini yapabilir, ama "StringBuilder" yapamaz.
   3) Ayni anda bir cok isin yapilmasina "multi threading" denir. "multi" = Cok, "thread"= Yapilan islerin herbiri
      Multi threading varsa, bu islerin siraya konulmasi lazim.Islerin siraya konulmasina "synchronization" denir.
​
				 */
        String name = "";
        System.out.println(name);
        System.out.println(name.concat("ali"));

        System.out.println("name = " + name);//  -> hiçlik
        name += "Qa tester ";
        System.out.println("name = " + name);// Qa tester
        name += "Seckin Bey";
        System.out.println("meyt call oncesi name = " + name);// Qa tester Seckin Bey
        strBirlestir(name);//Qa tester Seckin Bey method call run edildi dewamkeee :) -> immutable String Class
        System.out.println("meyt call sonrası name = " + name);// Qa tester Seckin Bey


        // task-> 3333 tekrarlı loop ile String variable ve StringBuilder obj run time surelerini karşılaştıran code create ediniz
        String str = "";// bos str
        StringBuilder sb = new StringBuilder();// boş sb
        System.out.println("   ***   str loop   ***   ");
        LocalTime strStart = LocalTime.now();//str başlangıç zamanı tanımlandı
        for (int i = 0; i < 3333; i++) {
            str += i;//3333 tekaralı concat action tanımlandı
        }

        LocalTime strFinish = LocalTime.now();//str bitiş zamanı tanımlandı

        System.out.println("str run suresi : " + (strFinish.getNano() - strStart.getNano()));

        System.out.println("   ***   sb loop   ***   ");
        LocalTime sbStart = LocalTime.now();//sb başlangıç zamanı tanımlandı

        for (int i = 0; i < 3333; i++) {
            sb.append(i);//3333 tekrarlı appent action tanımlandı
        }
        LocalTime sbFinish = LocalTime.now();// sb bitiş zamanı tanımlandı
        System.out.println("sb run suresi : " + (sbFinish.getNano() - sbStart.getNano()));

    }//main sonu

    private static void strBirlestir(String str) {
        System.out.println(str + " method call run edildi dewamkeee :) ");
    }
}

