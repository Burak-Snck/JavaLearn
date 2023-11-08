package Denemesayfası.Tasksolution;

public class task07 {
    public static void main(String[] args) {
        String kelime = "ab"; // Örnek olarak "Merhaba" kelimesini kullanıyorum

        // İlk harfi al
        char ilkHarf = kelime.charAt(0);

        // ASCII kodunu bul
        int asciiKodu = (int) ilkHarf;

        // Sonucu yazdır
        System.out.println("İlk harfin ASCII kodu: " + asciiKodu);
    }
}
