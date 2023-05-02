package capituloseisexerciciospropostos;
import java.util.Scanner;
public class ExerPropDezenoveCapSeis {

		    public static void main(String[] args) {
		        Scanner input = new Scanner(System.in);
		        int vetor1[] = new int[10];
		        int vetor2[] = new int[10];
		        int vetorResultante[] = new int[10];

		        // Lendo os elementos do primeiro vetor
		        System.out.println("Digite os elementos do primeiro vetor:");
		        for (int i = 0; i < 10; i++) {
		            vetor1[i] = input.nextInt();
		        }

		        // Lendo os elementos do segundo vetor
		        System.out.println("Digite os elementos do segundo vetor:");
		        for (int i = 0; i < 10; i++) {
		            vetor2[i] = input.nextInt();
		        }

		        // Multiplicando os elementos de mesmo índice e armazenando no vetor resultante
		        for (int i = 0; i < 10; i++) {
		            vetorResultante[i] = vetor1[i] * vetor2[i];
		        }

		        // Exibindo o vetor resultante
		        System.out.println("Vetor resultante:");
		        for (int i = 0; i < 10; i++) {
		            System.out.print(vetorResultante[i] + " ");
		        }

		        input.close();
		    }


}
