

public class ordemInversa {

public static void main(String[] args) {
    

    int[] vetor = {-5, -6, 15, 50, 8, 4};

    System.out.println("vetor: ");
    int count = 0;
    while (count < (vetor.length)) {
        System.out.print(vetor[count] + " ");
        count++;
    }

    System.out.print("\nVetor: ");
    for(int i = (vetor.length - 1); i >= 0; i--) {
        System.out.print(vetor[i] + " ");
    }  
 }
}