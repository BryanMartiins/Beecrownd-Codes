import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        double distPercorrida, qtdLitro, consMedio=0;

        distPercorrida = sc.nextDouble();
        qtdLitro = sc.nextDouble();

        consMedio += (distPercorrida / qtdLitro);

        System.out.printf("%.3f km/l\n", consMedio);
    }
}