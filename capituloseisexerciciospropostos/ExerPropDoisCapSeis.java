package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropDoisCapSeis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[7];

		// Preencher o vetor de números inteiros
		System.out.println();
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
			numeros[i] = scanner.nextInt();
		}

		// Processos para números múltiplos de 2
		System.out.print("\nNúmeros múltiplos de 2: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 2 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		// Processos para números múltiplos de 3
		System.out.print("\nNúmeros múltiplos de 3: ");
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] % 3 == 0) {
				System.out.print(numeros[i] + " ");
			}
		}

		// Processos para números múltiplos de 2 e de 3
		System.out.print("\nNúmeros múltiplos de 2 e de 3: ");
		for (int i = 0; i < numeros.length; i++) {
			if ((numeros[i] % 2 == 0) && (numeros[i] % 3 == 0)) {
				System.out.print(numeros[i] + " ");
			}
		}
	}
}
