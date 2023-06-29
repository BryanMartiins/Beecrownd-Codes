import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int i = scanner.nextInt();
        int N = 1;
        for (int j = 1; j <= i; j++) {

            System.out.println(N + " " + (N + 1) + " " + (N + 2) + " PUM");
            N += 4;

        }
    }
}