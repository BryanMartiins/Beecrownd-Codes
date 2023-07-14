import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);

        int X, Y;

        X = sc.nextInt();
        Y = sc.nextInt();

        while (true){
            if (X >= 1 && Y>=1){
                System.out.println("primeiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
            else if (X<=-1 && Y >=1){
                System.out.println("segundo");
                X = sc.nextInt();
                Y = sc.nextInt();

            }
            else if (X<=-1 && Y<=-1){
                System.out.println("terceiro");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
            else if (X>=1 && Y<=-1){
                System.out.println("quarto");
                X = sc.nextInt();
                Y = sc.nextInt();
            }
            else {
                break;
            }
        }
    }
}