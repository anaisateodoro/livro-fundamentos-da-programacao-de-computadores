package capituloquatroexerciciospropostos;

import java.util.Scanner;

public class ExerPropVinteDoisCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;
		float peso;
		String grupo;

		System.out.print("\nDigite sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 0) {

			System.out.print("Digite seu peso: ");
			peso = entrada.nextFloat();

			if (peso > 0) {

				if (idade < 20) {

					if (peso <= 60) {
						grupo = "9";
					} else if (peso > 60 && peso <= 90) {
						grupo = "8";
					} else {
						grupo = "7";
					}
				} else if (idade >= 20 && idade <= 50) {
					if (peso <= 60) {
						grupo = "6";
					} else if (peso > 60 && peso <= 90) {
						grupo = "5";
					} else {
						grupo = "4";
					}
				} else {
					if (peso <= 60) {
						grupo = "3";
					} else if (peso > 60 && peso <= 90) {
						grupo = "2";
					} else {
						grupo = "1";
					}
				}

				System.out.println("\nSeu grupo de risco é " + grupo + "\n");
			} else {
				System.out.println("\nPeso, inválido!\n");
			}

		} else {
			System.out.println("\nIdade, inválida!\n");
		}

	}

}
