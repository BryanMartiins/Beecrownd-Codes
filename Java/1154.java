import java.util.Locale;
import java.util.Scanner;

public class 1154 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        float media = 0, cont = 0;
        int idade;

        while (true) {
            idade = input.nextInt();

            if (idade < 0) {
                break;
            }

            media += idade;
            cont++;

        }

        System.out.printf("%.2f\n", media / cont);

    }
}