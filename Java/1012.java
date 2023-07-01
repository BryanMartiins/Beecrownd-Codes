import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);


        Scanner sc = new Scanner(System.in);

        double A, B, C, trianguloRetan, areaCirc, areaTrap, areaQuadr, areaRetangulo;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        trianguloRetan = (A * C) / 2;
        areaCirc = (Math.pow(C, 2)) * 3.14159;
        areaTrap = ((A + B) * C) / 2;
        areaQuadr = B * B;
        areaRetangulo = A * B;

        System.out.printf("TRIANGULO: %.3f\n", trianguloRetan);
        System.out.printf("CIRCULO: %.3f\n", areaCirc);
        System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
        System.out.printf("QUADRADO: %.3f\n",areaQuadr);
        System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
    }
}