package capituloquatroexerciciospropostos;

import java.util.Scanner;

public class ExerPropQuatroCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float num1, num2, maior = 0;

		System.out.println("\nDigite dois números:");
		num1 = entrada.nextFloat();
		num2 = entrada.nextFloat();

		if (num1 != num2) {
			if (num1 < num2) {
				maior = num2;
			} else if (num2 < num1) {
				maior = num1;
			}

			System.out.println("\nMaior número: " + maior + "\n");
		} else {
			System.out.println("\nOs números são iguais\n");
		}

	}

}
