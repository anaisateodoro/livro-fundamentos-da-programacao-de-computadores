package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteQuatroCapTre {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float dinReal, dinDolar, dinMarco, dinLibra;

		System.out.print("\nDigite a quantidade de dinheiro em reais: ");
		dinReal = entrada.nextFloat();

		dinDolar = dinReal * 1.80F;
		dinMarco = dinReal * 2;
		dinLibra = dinReal * 3.57F;

		System.out.println("\nBRL R$ " + casas.format(dinReal) + " = USD $ " + casas.format(dinDolar) + " = DEM "
				+ casas.format(dinMarco) + " = GBP £ " + casas.format(dinLibra));
	}
}
