import java.util.Scanner;

public class Nota {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

       int nota;

        while (true) {
            System.out.println("Digite uma nota:");
            nota = scan.nextInt();

            while(nota < 0 || nota > 10) {
                System.out.println("nota inválida! Digite novamente");
                nota = scan.nextInt();
            }
            
        }
    }
}
