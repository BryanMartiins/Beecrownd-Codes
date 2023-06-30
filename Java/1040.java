
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        double nota1 = 0, nota2 = 0, nota3 = 0, nota4 = 0;
        double medPonderada, exame;
        double medFinal;
        nota1 = scanner.nextDouble();
        nota2 = scanner.nextDouble();
        nota3 = scanner.nextDouble();
        nota4 = scanner.nextDouble();

        medPonderada = (nota1 * 0.2 + nota2 * 0.3 + nota3 * 0.4 + nota4 * 0.1);
        

        if (medPonderada >= 7.0 && medPonderada <= 10.0) {
            System.out.printf("Media: %.1f\n", medPonderada); 
            System.out.println("Aluno aprovado.");

        } 
        
        else if (medPonderada >= 5.0 && medPonderada <= 6.9) {
            System.out.printf("Media: %.1f\n", medPonderada);
            System.out.println("Aluno em exame.");
            exame = scanner.nextDouble();
            System.out.println("Nota do exame: " + exame);

            medFinal = (exame + medPonderada) / 2;

            if (medFinal >= 5.0 && medFinal <= 10.0) {
                System.out.println("Aluno aprovado.");
            }
            else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + medFinal);
        }

        
        else {
            System.out.printf("Media: %.1f\n", medPonderada-0.1);
            System.out.println("Aluno reprovado.");
        }

    }
}