import java.util.Scanner;

public class 1146 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int X;

        X = input.nextInt();
        while (X != 0) {

            for (int j = 1; j <= X; j++) {

                if (j == X) {
                    System.out.printf("%d", j);
                }

                else {
                    System.out.printf("%d ", j);
                }

            }
            System.out.println();
            X = input.nextInt();
        }

    }

}
    

