import java.util.Scanner;

public class MaiorEMedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("numero: ");
        numero = scan.nextInt();

        soma = soma + numero;

        if (numero > maior) maior = numero;

        count = count + 1;

        } while(count < 5);

        System.out.println("maior: " + maior);
        System.out.println("média: " + (soma/5));
    }
}
