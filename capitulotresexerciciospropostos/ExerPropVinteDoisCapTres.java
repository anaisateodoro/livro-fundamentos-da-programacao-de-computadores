package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropVinteDoisCapTres {

	public static void main(String[] args) {
		// Sabe-se que ND=N*(N-3)/2, em que N é o número de lados do polígno
		Scanner entrada = new Scanner(System.in);
		int numLado, numDiagonal;

		System.out.print("\nDigite o número de lados de um polígono convexo: ");
		numLado = entrada.nextInt();

		numDiagonal = (numLado * (numLado - 3)) / 2;

		System.out.println("\nNúmero de diagonais do polígono: " + numDiagonal);

	}

}
