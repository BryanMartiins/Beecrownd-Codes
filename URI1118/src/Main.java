import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double  nota1, nota2 , opcao,media;
        while (true) {
            // primeira nota
            nota1 = sc.nextDouble();
            while (nota1 < 0 || nota1 > 10) {
                System.out.println("nota invalida");
                nota1 = sc.nextDouble();

            }
            // segunda nota

            nota2 = sc.nextDouble();
            while (nota2 < 0 || nota2 > 10) {
                System.out.println("nota invalida");
                nota2 = sc.nextDouble();

            }
            media = (nota1 + nota2) / 2;
            System.out.printf("media = %.2f\n", media);
            int ver=1;
            while (true) { // break dentro de while que o while que está dentro
                System.out.println("novo calculo (1-sim 2-nao)");
                opcao = sc.nextDouble();
                if (opcao == 2) {
                    ver=2;
                    break;
                }
                else if (opcao==1){
                    break;
                }
            }
            if (ver==2){
                break;
            }
        }
    }
}

