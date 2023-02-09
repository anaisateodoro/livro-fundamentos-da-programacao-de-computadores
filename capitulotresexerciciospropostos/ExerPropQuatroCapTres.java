package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropQuatroCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double nota1, nota2, media;

		System.out.println("Digite duas notas: ");
		nota1 = entrada.nextDouble();
		nota2 = entrada.nextDouble();

		media = (nota1 * 2 + nota2 * 3) / (2 + 3);

		System.out.println("Média: " + media);

		entrada.close();

	}

}
