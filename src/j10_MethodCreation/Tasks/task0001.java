package j10_MethodCreation.Tasks;

public class task0001 {
    public static void main(String[] args) {
        String para="$1 $12 €34 €56 $45 €78";
    
        calculate(para);
    }
    private static void calculate(String para) {
        String[] divided = para.split("");
        int TotalDolar = 0;
        int Totaleuro = 0;

        for (String item : divided) {
            if (item.startsWith("$")) {
                int amount = Integer.parseInt(item.substring(1));
                TotalDolar += amount;
            } else if (item.startsWith("€")) {
                int amount = Integer.parseInt(item.substring(1));
                Totaleuro += amount;
            }
        }
        System.out.println("Total dolar: " + TotalDolar);
        System.out.println("Total euro: " + Totaleuro);
    }
}

