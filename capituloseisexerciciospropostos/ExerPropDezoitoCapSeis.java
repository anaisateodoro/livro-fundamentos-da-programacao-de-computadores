package capituloseisexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezoitoCapSeis {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int[] numeros = new int[15];
		for (int i = 0; i < numeros.length; i++) {
			System.out.print("Digite o número na posição " + (i + 1) + ": ");
			numeros[i] = scanner.nextInt();
		}

		int maiorNumero = numeros[0], menorNumero = numeros[0];
		int posicaoMaior = 0, posicaoMenor = 0;

		for (int i = 1; i < numeros.length; i++) {
			if (numeros[i] > maiorNumero) {
				maiorNumero = numeros[i];
				posicaoMaior = i;
			}
			if (numeros[i] < menorNumero) {
				menorNumero = numeros[i];
				posicaoMenor = i;
			}
		}

		System.out.println("Maior número: " + maiorNumero + " na posição " + (posicaoMaior + 1));
		System.out.println("Menor número: " + menorNumero + " na posição " + (posicaoMenor + 1));
	}

}
