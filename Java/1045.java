
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double A, B, C, aux;

        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();

        if (B > A && B > C) {
            aux = B;
            B = A;
            A = aux;
        }
        if (C > A && C > B) {
            aux = C;
            C = A;
            A = aux;
        }

        if (A >= (B + C)) {
            System.out.println("NAO FORMA TRIANGULO");
            return;
        }

        if (A * A == ((B * B) + (C * C))) {
            System.out.println("TRIANGULO RETANGULO");
        }

        if (A * A > ((B * B) + (C * C))) {
            System.out.println("TRIANGULO OBTUSANGULO");
        }

        if (A * A < ((B * B) + (C * C))) {
            System.out.println("TRIANGULO ACUTANGULO");
        }

        if (A == B && B == C) {
            System.out.println("TRIANGULO EQUILATERO");
            return;
        }
        if (A == B || B == C || C == A) {
            System.out.println("TRIANGULO ISOSCELES");
        }

    }
}