import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] consoantes = new String[6];
        int quantidadeConsoantes = 0;

        int count = 0;

        do {
            System.out.println("letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("a") |
            letra.equalsIgnoreCase("a") )) {
                consoantes[count] = letra;
                quantidadeConsoantes++;
            }

            count++;

        } while (count < consoantes.length);

        System.out.println("consoantes: ");
        for (String consoante : consoantes) {
            System.out.print(consoante + " ");
            
        }
    }
}
