package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteTresCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int id, quantidade, pctDesconto;
		float prUnitario, prTotal, prFinal, desconto;

		System.out.print("\nDigite o código do produto: ");
		id = entrada.nextInt();
		System.out.print("Digite a quantidade do produto escolhido: ");
		quantidade = entrada.nextInt();

		if (id > 0 && id < 41) {

			if (id >= 1 && id <= 10) {
				prUnitario = 10;
			} else if (id >= 11 && id <= 20) {
				prUnitario = 15;
			} else if (id >= 21 && id <= 30) {
				prUnitario = 20;
			} else {
				prUnitario = 30;
			}

			prTotal = prUnitario * quantidade;

			if (prTotal < 250) {
				pctDesconto = 5;
			} else if (prTotal >= 250 && prTotal <= 500) {
				pctDesconto = 10;
			} else {
				pctDesconto = 15;
			}

			desconto = (prTotal * pctDesconto) / 100;
			prFinal = prTotal - desconto;

			System.out.println("\nPreço unitário do produto: R$ " + casas.format(prUnitario));
			System.out.println("Preço total da nota: R$ " + casas.format(prTotal));
			System.out.println("Desconto de " + pctDesconto + "%: R$ " + casas.format(desconto));
			System.out.println("Preço final da nota: R$ " + casas.format(prFinal) + "\n");

		} else {
			System.out.println("\nNão existe um produto para este código!\n");
		}
	}

}
