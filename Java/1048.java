
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double salInicial, salNovo, reajuste;

        salInicial = sc.nextDouble();

        if (salInicial <= 400.00) {
            reajuste = 0.15;

            salNovo = salInicial * reajuste;

        }

        else if (salInicial >= 400.01 && salInicial <= 800.00) {
            reajuste = 0.12;
            salNovo = salInicial * reajuste;
        }

        else if (salInicial >= 800.01 && salInicial <= 1200.00) {
            reajuste = 0.10;
            salNovo = salInicial * reajuste;

        }

        else if (salInicial >= 1200.01 && salInicial <= 2000.00) {
            reajuste = 0.07;
            salNovo = salInicial * reajuste;
        } else {
            reajuste = 0.04;
            salNovo = salInicial * reajuste;
        }

        System.out.printf("Novo salario: %.2f\n", salNovo + salInicial);
        System.out.printf("Reajuste ganho: %.2f\n", salNovo);
        System.out.printf("Em percentual: %.0f %%\n", reajuste * 100);
    }
}
