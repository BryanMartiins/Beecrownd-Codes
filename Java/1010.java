import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double cod1, numP1, valorUnita1;
        double cod2, numP2, valorUnita2;
        double TOTAL;
        cod1 = sc.nextDouble();
        numP1 = sc.nextDouble();
        valorUnita1 = sc.nextDouble();
        cod2 = sc.nextDouble();
        numP2 = sc.nextDouble();
        valorUnita2 = sc.nextDouble();

        TOTAL = ((numP1 * valorUnita1) + (numP2 * valorUnita2));
           
        
        System.out.printf("VALOR A PAGAR: R$ %.2f\n",TOTAL);
    }
}