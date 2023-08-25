import java.util.Scanner;

public class 1146 {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        int X;
        X = input.nextInt();
        while (X != 0) {
            
            for (int i = 1; i <= X; i++) {

                if (X == 0) {
                    break;
                }

                else if (i == X) {
                    System.out.printf("%d \n", i);
                } else {
                    System.out.printf("%d ", i);
                }

            }
            X = input.nextInt();
        }
        

    }

}
