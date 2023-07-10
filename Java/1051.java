
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double salary, renda;

        salary = input.nextDouble();

        if (salary <= 2000.00) {
            System.out.println("Isento");
        }

        else if (salary >= 2000.01 && salary <= 3000.00) {
            renda = (salary - 2000) * 0.08;
            System.out.printf("R$ %.2f\n", renda);
        }

        else if (salary >= 3000.01 && salary <= 4500.00) {
            renda = (salary - 3000) * 0.18 + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", renda);
        }

        else {
            renda = (salary - 4500) * 0.28 + (1500 * 0.18) + (1000 * 0.08);
            System.out.printf("R$ %.2f\n", renda);
        }

    }
}