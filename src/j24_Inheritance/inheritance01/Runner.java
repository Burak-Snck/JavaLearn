package j24_Inheritance.inheritance01;

public class Runner {

    /*
1)Java'da class'lar arasinda parent(Aile)-child(Cocuk)  relationship(iliski) tanımlanmıştır.
2)Parent Class'a "super class"   Child Class'a sub clas  denir.
3)Ortak ozellikler parent class'a, specific ozellikler child class'a tanımlanır.
4)Parent Child Relationship "reusability", "maintenance",  "less code", "well organization" avantajları için kullanılır.
5)Child classlar parent'lardaki her methodu ve variable'i  kullanabilir ama parent class child'dakileri kullanamaz.
6)Java "Multiple Inheritance"'i desteklemez. Yani; Java'da  bir Child Class'in 1'den fazla parent'i olamaz.
7)Bir parent class, 1'den fazla child class ile olusturulan  parent child relationship'e "Hierarchical Inheritance"
 denir.
8)Child-Parent-Grandparent... seklinde olusturulan cok katli  parent child relationshipe'e multi-level inheritance denir.
9)"Object Class" -> Hz.Adem Class :) butun classlarin parent class'idir. Java'da parent class'i olmayan tek class "Object Class"dir

*/
    public static void main(String[] args) {
        Hayvancik h1 = new Hayvancik();//grand class dan obj created
        h1.hareket();
        h1.beslenme();
        h1.içme();



        Paluk b1 = new Paluk();//parent classdan obj create
        b1.izgaraTava();//
        b1.hareket();
        b1.beslenme();
        b1.içme();


        Mammal m1 = new Mammal();
        m1.sutBeslen();
        m1.dogum();//parent classdan gedldi
        m1.hareket();//grand parentten hareket geldi
        m1.beslenme();//garand parent
        m1.içme();//grand parent


        Goyun g1 = new Goyun();
        g1.semir();//child classdan geldi
        g1.sutBeslen();//parent calss
        g1.dogum();//parent classdan gedldi
        g1.hareket();//grand parent
        g1.beslenme();//grand parent
        g1.içme();//grand parent


        Kedi t1=new Kedi();//child classdan obj create edildi
        t1.cırmalama();
        t1.beslenme();
        t1.dogum();
        t1.içme();
        t1.dogum();
        t1.sutBeslen();
    }


}
