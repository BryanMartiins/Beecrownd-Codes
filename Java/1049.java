
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner input = new Scanner(System.in);

        String priClasse, segClasse, terClasse;

        priClasse = input.next();
        segClasse = input.next();
        terClasse = input.next();

        if (priClasse.equalsIgnoreCase("vertebrado")) {
            if (segClasse.equalsIgnoreCase("ave")) {

                if (terClasse.equalsIgnoreCase("carnivoro")) {
                    System.out.println("aguia");

                } else {
                    System.out.println("pomba");

                }

            }

            else {
                if (terClasse.equalsIgnoreCase("onivoro")) {
                    System.out.println("homem");

                } else {
                    if (terClasse.equalsIgnoreCase("herbivoro")) {
                        System.out.println("vaca");

                    }
                }
            }
        }

        if (priClasse.equalsIgnoreCase("invertebrado")) {
            if (segClasse.equalsIgnoreCase("inseto")) {
                if (terClasse.equalsIgnoreCase("hematofago")) {
                    System.out.println("pulga");

                }

                else {
                    if (terClasse.equalsIgnoreCase("herbivoro")) {
                        System.out.println("lagarta");
                    }
                }
            }

            else if (segClasse.equalsIgnoreCase("anelideo")) {
                if (terClasse.equalsIgnoreCase("hematofago")) {

                    System.out.println("sanguessuga");

                }

                else if (terClasse.equalsIgnoreCase("onivoro")) {
                    System.out.println("minhoca");
                }
            }
        }
    }
}