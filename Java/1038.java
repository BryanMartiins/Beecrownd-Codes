import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int codLanche, quantidade;
        double cachQuente = 4.0, xSalad = 4.50, xBacon = 5.0, torraSimples = 2.0, refri = 1.5, lancheTotal = 0;

        codLanche = sc.nextInt();
        quantidade = sc.nextInt();

        if (codLanche == 1) {
            lancheTotal = cachQuente * quantidade;
        }
        
        else if (codLanche == 2) {
            lancheTotal = xSalad * quantidade;
        }
        
        else if (codLanche == 3) {
            lancheTotal = xBacon * quantidade;
        }
        
        else if (codLanche == 4) {
            lancheTotal = torraSimples * quantidade;
        }
        
        else if (codLanche == 5) {
            lancheTotal = refri * quantidade;
        }
        System.out.printf("Total: R$ %.2f\n", lancheTotal);

     
    }

}
