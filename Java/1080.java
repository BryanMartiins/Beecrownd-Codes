import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int X, maior = 0, i = 0, posicao = 0;

        for (i = 1; i <= 100; i++) {
            X = input.nextInt();

            if (X > maior) {
                maior = X;
                posicao = i;
            }

        }
        System.out.printf("%d\n%d\n", maior, posicao);

    }
}