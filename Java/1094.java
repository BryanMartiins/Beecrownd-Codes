import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, rato = 0, sapo = 0, coelho = 0, quantidade;
        String M;
        double toTal = 0, R, S, C;
        X = input.nextInt();

        for (int i = 1; i <= X; i++) {

            quantidade = input.nextInt();

            M = input.next();

            if (M.equals("R")) {
                rato += quantidade;
            }

            else if (M.equals("S")) {
                sapo += quantidade;
            } else {
                coelho += quantidade;
            }
        }

        toTal = (rato + sapo + coelho);

        R = (rato * 100) / toTal;
        S = (sapo * 100) / toTal;
        C = (coelho * 100) / toTal;

        System.out.printf("Total: %.0f cobaias\n", toTal);
        System.out.printf("Total de coelhos: %d\n", coelho);
        System.out.printf("Total de ratos: %d\n", rato);
        System.out.printf("Total de sapos: %d\n", sapo);

        System.out.printf("Percentual de coelhos: %.2f %%\n", C);
        System.out.printf("Percentual de ratos: %.2f %%\n", R);
        System.out.printf("Percentual de sapos: %.2f %%\n", S);
    }
}