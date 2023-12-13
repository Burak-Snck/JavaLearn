package j27_Interface.Task;

public class Runner {
        public static void main(String[] args) {
        Şahin doganGorunumlu=new Şahin();
        doganGorunumlu.kapi();// agam 4 KAPI sedan
        doganGorunumlu.motor();// Agam 1.6 motor cok yakar az kaçar :(
        doganGorunumlu.yakıt();// Agam TÜPitak yoksa ocagına incir agacı tüplü ve öfkeli :(
        doganGorunumlu.kaporta();// Agam akordion KAPORTA gamzesiz olmaz :)
        doganGorunumlu.klima();// Agam aç camı serinle KLİMA senin neyine
        doganGorunumlu.koltuk();// Agam deri koltuk yazın pişik yapar aman içi saman olmasın :(
        doganGorunumlu.jant();// Agam senin gibin JANTİ teker coooğğğ  şeker:) JANT yakar kızlar bakar :)
        doganGorunumlu.ebatLastik();// Agam LASTIK gibi sundurme asfalt agladı beee :)
        doganGorunumlu.sunroof();//non-static concrete meth(overridden edilemeyen) obj ile call edildi->agam gunesli havada sunroof acarsan böğğğrüngde MAASALLAH okursun :)
        doganGorunumlu.sisLamp();//non-static concrete meth(overridden edilemeyen) obj ile call edildi->
        DışDonanım.anten();//static concrete meth interfaceName ile call edildi->Agam yine ANTIN KUNTIN işlerdesin :) çekemeyen ANTEN taksın
        System.out.println("DisDonanim.RENK = " + DışDonanım.RENK);//aynı data type ve name variable interfaceName ile call
        System.out.println("IcDonanim.RENK = " + İçDonanım.RENK);//aynı data type ve name variable interfaceName ile call
        System.out.println("Lastik.RENK = " + Lastik.RENK);//aynı data type ve name variable interfaceName ile call
        System.out.println("IcDonanim.KUMAS = " + İçDonanım.KUMAS);// kadife
        System.out.println("IcDonanim.MUSIC = " + İçDonanım.MUSIC);// arizona kertenkele STYLE :) underground

    }
}
