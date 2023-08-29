import java.util.Scanner;

public class 1151 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int anterior = 0, atual = 1, proximo = 0, X;

        X = input.nextInt();

        for (int i = 1; i <= X; i++) {
            if (i == X) {
                System.out.println(anterior);
            } else {
                System.out.print(anterior + " ");
                proximo = atual + anterior;
                anterior = atual;
                atual = proximo;

            }
        }

    }
}
