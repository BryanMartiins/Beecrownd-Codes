import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);

        Scanner sc = new Scanner(System.in);

        int A, B, C;

        A = sc.nextInt(); // valor 1
        B = sc.nextInt(); // valor 2
        C = sc.nextInt(); // valor 3

        if (A > B && A > C) {
            System.out.printf("%d eh o maior\n", A);
        } 

        else if (B > C) {
            System.out.printf("%d eh o maior\n", B);
        } 
        
        else {
            System.out.printf("%d eh o maior\n", C);
        }

    }
}