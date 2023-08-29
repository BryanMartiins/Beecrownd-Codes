import java.util.Scanner;

public class main {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);
        int X,Z, contador = 0, soma = 0;

        X = input.nextInt();
        Z = input.nextInt();

        while (Z <= X){
            Z = input.nextInt();
        }
        while (soma < Z){
            soma +=X;
            contador++;
            X++;
        }
        System.out.println(contador);


        
    }
}
