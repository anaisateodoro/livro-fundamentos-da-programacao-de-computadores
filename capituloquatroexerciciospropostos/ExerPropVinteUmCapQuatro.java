package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteUmCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float prProduto;
		int id;
		String procedencia;

		System.out.print("\nDigite o preço do produto: ");
		prProduto = entrada.nextFloat();

		if (prProduto > 0) {

			System.out.print("Digite o código de origem do produto: ");
			id = entrada.nextInt();

			if (id > 0 && id < 31) {

				if (id == 1) {
					procedencia = "Sul";
				} else if (id == 2) {
					procedencia = "Norte";
				} else if (id == 3) {
					procedencia = "Leste";
				} else if (id == 4) {
					procedencia = "Oeste";
				} else if (id == 5 || id == 6) {
					procedencia = "Nordeste";
				} else if (id >= 7 && id <= 9) {
					procedencia = "Sudeste";
				} else if (id >= 10 && id <= 20) {
					procedencia = "Centro-oeste";
				} else {
					procedencia = "Noroeste";
				}

				System.out.println("\nProcedencia do produto: " + procedencia);
				System.out.println("Preço do produto: R$ " + casas.format(prProduto) + "\n");
			} else {
				System.out.println("\nCódigo do produto, inválido!\n");
			}
		} else {
			System.out.println("\nPreço do produto, inválido!\n");
		}

	}

}
