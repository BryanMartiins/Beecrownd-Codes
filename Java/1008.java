import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double qtdHoras, horaValor, salary = 0;
        int number;

        number = sc.nextInt();
        qtdHoras = sc.nextDouble();
        horaValor = sc.nextDouble();

        salary = qtdHoras * horaValor;

        System.out.println("NUMBER = " + number);
        System.out.printf("SALARY = U$ %.2f\n", salary);
    }
}