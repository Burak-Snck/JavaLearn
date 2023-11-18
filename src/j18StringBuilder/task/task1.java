package j18StringBuilder.task;

public class task1 {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder();
        sb1.append("aaa").insert(1, "bb").insert(4, "ccc");
        System.out.println(sb1); // B ) abbaccca
        StringBuilder sb2 = new StringBuilder("Sebnem Hanımdan  bamya ");

       StringBuilder sb3=new StringBuilder("hasan ve ben dedizi");
        System.out.println("sb3.insert(1,sb2,7,11) = " + sb3.insert(1, sb2, 7, 11));



    }
}
