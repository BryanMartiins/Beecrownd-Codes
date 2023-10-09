import java.util.Locale;
import java.util.Scanner;

public class a1164 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int soma = 0, X, i=0, N=0;
        N = input.nextInt();
        for (int j = 0; j <= N; j++) {

            X = input.nextInt();

            for (i = 1; i < X; i++) {
                if (X % i == 0) {
                    soma += i;
                }

            }
            if (soma == X) {
                System.out.printf("%d eh perfeito\n",soma);
            } else {
                System.out.printf("%d nao eh perfeito\n",X);
            }
            soma=0;
        }
    }
}