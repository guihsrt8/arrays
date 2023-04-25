import java.util.Scanner;

public class ImparPar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numero;
        int quantNumero;
        int count = 0;
        int quantPar = 0;
        int quantImpar = 0;

        
    System.out.println("Digite a quantidade de numero:");
     quantNumero = scan.nextInt();

    do {
        System.out.println("numero:");
        numero = scan.nextInt();

        if (numero % 2 == 0) quantPar++;
        else quantImpar++;
        count = count +1;
    }while (count < quantNumero);

        System.out.println("quantidade de par" + quantPar); 
        System.out.println("quantidade de impar" + quantImpar); 
    }
}
