package URI1132;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x , y,soma=0,aux;

        x = scanner.nextInt();
        y = scanner.nextInt();
        
        if (x>y){
          aux=y;
          y=x;
          x=aux;
        }
        for (int i = x; x<=y;i++){
            soma+=i;
        }

        System.out.println(soma);
    


    }
}
