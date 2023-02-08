package capitulotres;

import java.util.Scanner;

public class ExercicioVinteUmCapTres {

	public static void main(String[] args) {
		double X, Y, Z;
		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o tamanho da escada: ");

		Z = entrada.nextDouble();

		System.out.print("Digite a altura desejada: ");

		X = entrada.nextDouble();

		Y = Math.pow(Z, 2) - Math.pow(X, 2);

		Y = Math.sqrt(Y);

		System.out.println("A distância necessária é: " + Y);

	}

}
