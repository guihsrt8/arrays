import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("digite um numero: ");
        int fatorial = scan.nextInt();

        System.out.println("Fatorial de: " + fatorial);

        int multiplica = 1;

        System.out.print(fatorial + "! =");
        for( int i = fatorial; i >= 1; i--) {
            multiplica = multiplica * i;
        }
        System.out.println(multiplica);
    }
}
