
import java.util.Scanner;
public class Main {
     public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int X, Y,soma=0, aux;

        X= scanner.nextInt();
        Y= scanner.nextInt();

        if (X>Y){
            aux=Y;
            Y=X;
            X=aux;
        }
        for (int i = X; X<=Y;i++){
            soma+=i;
        }

        System.out.println(soma);

        
    }
}
