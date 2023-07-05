
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        int A, B, C, D;
        int soma1,soma2;
        A = input.nextInt();
        B = input.nextInt();
        C = input.nextInt();
        D = input.nextInt();

        soma1 = C + D;
        soma2 = A + B;

        if ((B > C && D > A) && (soma1 > soma2) && (C > -1 && D > -1) && (A % 2 == 0)) {

            
            System.out.println("Valores aceitos");
        }
        
        else {
            System.out.println("Valores nao aceitos");
        }

    }
}
