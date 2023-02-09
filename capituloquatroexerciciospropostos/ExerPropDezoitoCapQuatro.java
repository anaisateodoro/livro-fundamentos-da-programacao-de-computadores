package capituloquatroexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezoitoCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int idade;

		System.out.print("\nDigite a sua idade: ");
		idade = entrada.nextInt();

		if (idade >= 0) {

			if (idade >= 18) {
				System.out.println("Você já atingiu a maioridade");
			} else {
				System.out.println("Você ainda não atingiu a maioridade");
			}
		} else {
			System.out.println("Idade, inválida!");
		}

	}

}
