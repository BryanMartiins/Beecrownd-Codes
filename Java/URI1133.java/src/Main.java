import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X, Y, resto, aux;

        X = sc.nextInt();
        Y = sc.nextInt();

        if (X > Y) {
            aux = Y;
            Y = X;
            X = aux;
        }

        for (int i = X+1; i < Y; i++) {
            resto = i % 5;
            if (resto == 2 || resto == 3) {
                System.out.println(i);
            }
        }
    }
}