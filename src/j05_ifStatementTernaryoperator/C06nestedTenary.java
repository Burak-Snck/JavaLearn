package j05_ifStatementTernaryoperator;

public class C06nestedTenary {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 30;

        int result = (x > y)? ((x > z)? x : z) : ((y > z)? y : z);
        System.out.println(result);
    }
}
