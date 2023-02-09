package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDezesseisCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float prAtual, prNovo, desconto;
		int id, pctDesconto;

		System.out.print("\nDigite o código do produto: ");
		id = entrada.nextInt();
		System.out.print("Digite o preço atual deste produto: ");
		prAtual = entrada.nextFloat();

		if (prAtual > 0) {

			if (prAtual < 30) {
				pctDesconto = 0;
			} else if (prAtual >= 30 && prAtual <= 100) {
				pctDesconto = 10;
			} else {
				pctDesconto = 15;
			}

			desconto = (prAtual * pctDesconto) / 100;
			prNovo = prAtual - desconto;

			System.out.println("\nCódigo do produto: " + id);
			System.out
					.println("Seu novo preço com desconto de " + pctDesconto + "%: R$ " + casas.format(prNovo) + "\n");
		} else {
			System.out.println("\nPreço atual, inválido!\n");
		}

	}

}
