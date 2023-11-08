package j12_ArraysList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C01_Array_list {


    public static void main(String[] args) {
        int age = 33; //tek primitive
        int arr[] = new int[5];//5 int primitive data saklayan array variable
        int arr1[][] = new int[4][7]; //28 int pri ; //2

        ArrayList<Integer> agelist = new ArrayList<>();
           /*
     Array List genel Tanimi:
​
            ArrayList<Type> arrayListName  =new ArrayList<Type>();
                 List<Type> arrayListName = new ArrayList<>();
​
             1. Type : String, Integer, Double, Long, Byte, Short, Boolean, Object, .... seklinde Class olmalidir
                - ArrayList<int> hatali bir tanimlamadir. Type Wrapper Class gibi object türünden olmalidir
​
​
            2.  - Arrayler degistirilemez sabit bir .length;'de tanimlanir.
                - ArrayList'ler degistirilebilir size(); belirleme zorunlulugu olmadan tanimlanır.
            3.  Intellij sonda bos biralikan <> yerine <~> seklinde ifade yazabilir bu ifade tanimdaki tür ile ayni anlamindadir.
​
    List declarations(tanımlama) :
    Array den farki boyut esnekleğidir.Array'lerde length sabittir, degistirilemez. ArrayList'lerde (List) length esnektir.
     eleman ekledikce List size'ini artirir,  eleman sildikce List size'ini azaltir.
​
​
    key word: List<Wrapper Class> name=
​
    List'e assaign etme(atama) :
    List'ler data type olarak primitive'leri kabul etmez. Primitive'lerde data type'ini non-primitive yapmak icin wrapper class'lari kullanilir.
    List<wrapper Class> name = new List<>()      *****yanlışşşşşşş (<> :jenerik wrapper Class dan parametre alır.)
    List<wrapper Class> name = new ArrayList<>() *****doğru
    List<wrapper Class> name = new ArrayList<Wrapper Class>() *****doğru->best practice
    ArrayList<wrapper Class> name = new ArrayList<>()  *****doğru
​
    List'e ilk değer atama (initialize):....
    1.yol : asList();
    ArrayList<Integer> sayı= new ArrayList<>(Arrays.asList(1,2,3)) demek 1,2,3 elemanlarini array olarak al demektir.
    2.yol : Listof();
    ArrayList<String> ulkeler= new ArrayList<String>( List.of("Almanya", "Fransa", "Ingiltere", "Ispanya", "Italya") );
​
    ArrayList ler array'lerin aksine direkt olarak ekrana yazdirilabilirler-->  print için:  System.out.println(name);
    Array'ler Arrays.toString(arrayAdi); ile print edilir.
​
​
    Collections ==> Bir araya getirilmis parcalar anlamına gelir. ArrayList, Set, Vector, Queue ler java collections sınıfı nesneleridir.
​
 */
        //list tanımlama ve değer atama

        ArrayList<Integer> sayılist = new ArrayList<>();//integer data tutan boş bilist tanımlandı

        //1.yol add .meth
        System.out.println("sayılist.add(17) = " + sayılist.add(17));//true false döner ekledim diye
        sayılist.add(43);
        sayılist.add(19);
        sayılist.add(33);
        sayılist.add(35);
        sayılist.add(34);
        sayılist.add(10);
        sayılist.add(10);//aynı eleman birden çok eklenebilir
        System.out.println("sayılist = " + sayılist);
        // 2.yol  Arrays.add list metodu ile

        ArrayList<String>yemeklist=new ArrayList<>(Arrays.asList("küşleme","kuzugerdan","haşlama","gerdan"));
        System.out.println("yemeklist = " + yemeklist);
   // 3.yol  list of  meth çuval

        ArrayList<String>ulkelist=new ArrayList<>(List.of("alamanya","danimarka","izlanda","nijer"));
        System.out.println(ulkelist);

        //****
        ArrayList<Integer> rakamList = new ArrayList<>() {
            {
                for (int i = 0; i < 10; i++) {
                    add(i);
                }
            }
        };

        System.out.println("rakamList = " + rakamList);//[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
        // list print etme..
        // sout(listName);

    }
}
