
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tempInicial, tempFinal;
        int horasFinais;

        tempInicial = sc.nextInt();
        tempFinal = sc.nextInt();

        if (tempInicial < tempFinal) {
            horasFinais = tempFinal - tempInicial;

        }
        
        else {
            horasFinais = 24 - tempInicial + tempFinal;
        }

        System.out.printf("O JOGO DUROU %d HORA(S)\n", horasFinais);

    }
}
