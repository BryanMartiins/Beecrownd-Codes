import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        double X, par = 0, impar = 0, posit = 0, negat = 0;

        for (int i = 1; i < 6; i++) {

            X = input.nextDouble();

            if (X % 2 == 0) {
                par++;
            } 
            if (X % 2 != 0) {
                impar++;
            }
            if ( X > 0){
                posit++;
            }
            if (X <= -1){
                negat++;
            }

        }

        System.out.printf("%.0f valor(es) par(es)\n", par);
        System.out.printf("%.0f valor(es) impar(es)\n", impar);
        System.out.printf("%.0f valor(es) positivo(s)\n", posit);
        System.out.printf("%.0f valor(es) negativos(s)\n", negat);
    }
}