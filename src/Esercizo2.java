import java.util.Scanner;

public class Esercizo2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        while (true) {
            try {
                System.out.println("inserisci i km percorsi:");
                int km = Integer.parseInt(input.nextLine());
                if (km == 0) throw new ArithmeticException("hai inserito 0");
                System.out.println("inserisci i litri di carburante consumati:");
                int lt = Integer.parseInt(input.nextLine());
                if (lt == 0) throw new ArithmeticException("hai inserito 0");
                int consumo = km / lt;
                System.out.println("il consumo è di :" + consumo + "  km/lt");
                break;
            } catch (Exception x) {
                System.err.println(x.getMessage());
            }
        }
        input.close();
    }
}
