import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int A, B, C;

        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        if (A > B && A > C) {
            if (B > C) {
                System.out.printf("%d\n%d\n%d\n", C, B, A);
            }

            else {
                System.out.printf("%d\n%d\n%d\n", B, C, A);
            }
        }

        else if (B > A && B > C) {
            if (C > A) {
                System.out.printf("%d\n%d\n%d\n", A, C, B);
            }

            else {
                System.out.printf("%d\n%d\n%d\n", C, A, B);
            }
        }

        else {
            if (A > B) {
                System.out.printf("%d\n%d\n%d\n", B, A, C);
            } else {
                System.out.printf("%d\n%d\n%d\n", A, B, C);
            }

        }
        System.out.println();

        System.out.println(A);
        System.out.println(B);
        System.out.println(C);
    }

}
