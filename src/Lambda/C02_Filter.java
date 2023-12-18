package Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {

    /*
Filter:
    Dizimiz veya Collection’ımız üzerinde bizim belirteceğimiz koşullar doğrultusunda
    filtreleme işlemi yapmamıza yarayan bir yapıdır.
    Bu işlem sonrası belirttiğimiz koşula uygun olmayan elemanlar bir sonraki aşamada kullanılamazlar.
    Artık elimizde filtrelenmiş/süzülmüş/elenmiş bir veri vardır


     */
    public static void main(String[] args) {

        List<Integer> sayılıst=new ArrayList<>(Arrays.asList(7,12,15,25,6,3,89,43,34,22,58,50,71,35));
/*
//Task01->"Structured Programming"--> AMELE Programming kullanarak
 listin çift elemanlarını aynı satırda aralarında bosluk ile print ediniz
 */
        System.out.println("TASK 0001");

        printçiftal(sayılıst);
        System.out.println("TASK 0002");

        //task02-> "Functional Programming"--> CINCIX Programming
        // kullanarak  listin çift elemanlarını aynı satırda aralarında bosluk ile print edin


        printçiftal1(sayılıst);

//task03-> "Functional Programming"--> CINCIX Programming kullanarak  listin
// 35'den kucuk çift elemanlarını aynı satırda aralarında bosluk ile print ediniz

        printküçükçift(sayılıst);

///TASK 04


    }

    private static void printküçükçift(List<Integer> sayılıst) {
        System.out.println("mssmsm");
        sayılıst.stream().filter((t)->t<35).filter( SeedMethods::çiftmi).forEach((SeedMethods::intprintet));
        System.out.println("dllld");
        sayılıst.stream().filter(SeedMethods::değer).forEach((SeedMethods::intprintet));
    }

    private static void printçiftal1(List<Integer> sayılıst) {
        System.out.println("tata");
        sayılıst.stream().filter(SeedMethods::çiftmi).forEach((SeedMethods::intprintet));

    }

    private static void printçiftal(List<Integer> sayılıst) {


        for (Integer k:sayılıst) {
            if(k%2==0){
                System.out.print(k+" ");

            }

        }

    }


}
