import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double A, B, C;
        double perimetro, area;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        perimetro = (A + B + C);

        if (A + B > C && B + C > A && C + A > B) {
            System.out.printf("Perimetro = %.1f\n", perimetro);
        } else {
            System.out.printf("Area = %.1f\n", area = ((A + B) * C) / 2);
        }

    }

}
