package capituloseis;

import java.util.Scanner;

public class ExercicioUmCapituloSeis {

	public static void main(String[] args) {

		int num[] = new int[9];
		int i,j,k;
		int cont = 0;
	

		Scanner entrada = new Scanner(System.in);

		for (i = 0; i < 9; i++) {
			System.out.println("Digite o número: ");
			num[i] = entrada.nextInt();
		}

		for (i = 0; i < 9; i++) {
			cont = 0;
			for (j = 0; j <= num[i]; j++) {
				k = j + 1;
				if (num[i] % k == 0) {
					cont++;
				}
			}
			if (cont <= 2) {
				System.out.printf("O %d é um número primo.\n", num[i]);
				System.out.printf("Sua posiçao no vetor é %d\n", i);
		}

		}

	entrada.close();		
	}

}
