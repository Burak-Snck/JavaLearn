package j25_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_FileInputStreamException02 {


    public static void main(String[] args) {


        try {// inner try block file erişiim exception
            FileInputStream fis = new FileInputStream("src/j25_Exceptions/ebikgabık");
            int k; // erişilen file her bir char ascii değerini atacağı boş kutu tanımlandı
            try {
                while((k = fis.read()) != -1){
                    System.out.print((char)k);
                }
                System.out.println("inner try blok  try sorunsuz catch çalışmaz");
            }catch (IOException e){ //file çalışır ama okunmazsa çalışır

            }



              System.out.println("try  outher blok bunu okuduysan try çalışmıştır");
        } catch (FileNotFoundException e) { //file erişilemezse bu çalışır
            System.out.println( "dosyaya erişemediği için çalıştı");
            System.out.println("Agam catch blok try catch yakaldı ");
            throw new RuntimeException(e);
        }


    }
}
