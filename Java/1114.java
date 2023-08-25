import java.util.Scanner;

public class 1114 {
    public static void main(String[] args) {


     

        Scanner sc = new Scanner(System.in);

        int X;

        X = sc.nextInt();

        while(X>0){
            if(X==2002){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
                X=sc.nextInt();
            }
        }
    }
}