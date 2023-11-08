package j07_StiringManipulation;

public class C05_Starts_EndsWith {


    /*
  startsWith()
  Metnin bas kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.
  String'in basladigi characteri dogrular
  endsWith()
  Metnin son kisminin istenilen dizi ile eslesip eslesmedigini kontrol eder. Sonucu boolean dir.


 */
    public static void main(String[] args) {
        String str1="ebik gabık";
        System.out.println(str1.endsWith("ebi"));
        System.out.println(str1.startsWith(str1));

    }


}
