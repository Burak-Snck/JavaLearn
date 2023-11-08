package Denemesayfası.Tasksolution;

public class task06 {
    public static void main(String[] args) {


        String kelime = "ab"; // Örnek olarak "Merhaba" kelimesini kullanıyorum

     int toplam =0;

      for (int i = 0; i <kelime.length(); i++) {
          char abs =kelime.charAt(i);
         toplam+=abs;


      }
        System.out.println(toplam);

    }
}
