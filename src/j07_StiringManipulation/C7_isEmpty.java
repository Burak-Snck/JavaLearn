package j07_StiringManipulation;

public class C7_isEmpty {
    public static void main(String[] args) {

         /*
 String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
*/

//        String str="madem geldin dünyaya hazır çalış";
//        System.out.println(str.isEmpty()); //False
//        System.out.println(str.length());
//        System.out.println(str.indexOf("a"));
//        System.out.println(str.isEmpty());
//         String str2="";
//        System.out.println("str2" + str2.isEmpty());
//        //dutluk
//       String str3=null;
     //   System.out.println(str3.isEmpty());
        //isBlank()-> hem "boş tanımlanan  String" için hem de "sadece space" içeren Strinler içn true diğerlerine false return eder
        String str2="";
        System.out.println(str2.isBlank());
      String  str4= "  ";
        System.out.println(str4.isEmpty());


    }
}
