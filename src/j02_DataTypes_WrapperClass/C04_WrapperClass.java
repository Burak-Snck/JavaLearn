package j02_DataTypes_WrapperClass;

public class C04_WrapperClass {
    public static void main(String[] args) {
        /*
           Note: Java primitive lere method'lar ekleyerek yeni bir
                 yapi olusturdu, bu yapiya "Wrapper Class"
                 Primitive         Wrapper
                    byte     ==>    Byte
                    short    ==>    Short
                    ** int   ==>    Integer
                    long     ==>    Long
                    float    ==>    Float
                    double   ==>    Double
                    boolean  ==>    Boolean
                    ** char  ==>    Character
        */

         /*
        non-primitive data turleri data depolamak yaninda kullanışlı birçok method'a sahiptir
ancak primitive data turlerinin boyle bir ozelligi yoktur
primitive data turleri sadece degerleri saklarlar (container) ve hwerhangi bir özellik(method) vs bulundurmaz.
Ancak primitive data turleri icin de bazi işlemler için (String'den tamsayı çekme) method'lar ihtiyaç
olduğunda Java her bir primitive data turunu, non-primitive  Wrapper Class  oluşturarak ilgili methodlarla
ara çözüm imkanı sunmuştur.
         */
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
    }
}
