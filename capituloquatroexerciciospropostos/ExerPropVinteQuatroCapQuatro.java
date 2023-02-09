package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteQuatroCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float prProduto, prNovo, aumento, imposto;
		int categoria, pctAumento, pctImposto;
		char situacao;
		String classificacao;

		System.out.print("\nDigite a preço do produto: ");
		prProduto = entrada.nextFloat();
		System.out.print("Qual a categoria do produto?\n1 - limpeza\n2 - alimentação\n3 - vestuário\n<< ");
		categoria = entrada.nextInt();
		entrada.nextLine();
		System.out.print("O produto selecionado precisa de refrigeração?\nS - Sim\nN - Não\n<< ");
		situacao = entrada.nextLine().charAt(0);
		situacao = Character.toUpperCase(situacao);

		if (prProduto > 0) {

			if (categoria == 1 || categoria == 2 || categoria == 3) {

				if (situacao == 'S' || situacao == 'N') {

					if (prProduto <= 25) {

						if (categoria == 1) {
							pctAumento = 5;
						} else if (categoria == 2) {
							pctAumento = 8;
						} else {
							pctAumento = 10;
						}
					} else {
						if (categoria == 1) {
							pctAumento = 12;
						} else if (categoria == 2) {
							pctAumento = 15;
						} else {
							pctAumento = 18;
						}
					}

					if (categoria == 2 || situacao == 'S') {
						pctImposto = 5;
					} else {
						pctImposto = 8;
					}

					aumento = (prProduto * pctAumento) / 100;
					imposto = (prProduto * pctImposto) / 100;
					prNovo = prProduto + aumento - imposto;

					if (prNovo <= 50) {
						classificacao = "Barato";
					} else if (prNovo > 50 && prNovo < 120) {
						classificacao = "Normal";
					} else {
						classificacao = "Caro";
					}

					System.out.println("\nAumento de " + pctAumento + "%: R$ " + casas.format(aumento));
					System.out.println("Imposto de " + pctImposto + "%: R$ " + casas.format(imposto));
					System.out.println("Preço final: R$ " + casas.format(prNovo));
					System.out.println("Classificação do preço final: " + classificacao + "\n");
				} else {
					System.out.println("\nOpção de refrigeração, inválida!\n");
				}
			} else {
				System.out.println("\nCategoria, inválida!\n");
			}
		} else {
			System.out.println("\nPreço, inválido!\n");
		}
	}

}
