package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDezCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float custoFabrica, imposto, distribuidor, preco;
		int pctImposto, pctDistribuidor;

		System.out.print("Digite o custo de fábrica do veículo: ");
		custoFabrica = entrada.nextFloat();

		if (custoFabrica > 0) {

			if (custoFabrica < 12000) {
				pctDistribuidor = 5;
				pctImposto = 0;
			} else if (custoFabrica >= 12000 && custoFabrica <= 25000) {
				pctDistribuidor = 10;
				pctImposto = 15;
			} else {
				pctDistribuidor = 15;
				pctImposto = 20;
			}

			distribuidor = (custoFabrica * pctDistribuidor) / 100;
			imposto = (custoFabrica * pctImposto) / 100;
			preco = custoFabrica + distribuidor + imposto;

			System.out.println("\nDistribuidor (" + pctDistribuidor + "%): R$ " + casas.format(distribuidor));
			System.out.println("IMposto (" + pctImposto + "%): R$ " + casas.format(imposto));
			System.out.println("Preço do veículo: R$ " + casas.format(preco));
		} else {
			System.out.println("\nCusto de fábrica, inválido!");
		}
	}

}
