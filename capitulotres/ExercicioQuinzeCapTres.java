package capitulotres;

import java.util.Scanner;

public class ExercicioQuinzeCapTres {

	public static void main(String[] args) {
		double p_fab, perc_d, perc_i, vlr_d, vlr_i, p_final;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o preço de fábrica: ");

		p_fab = entrada.nextDouble();

		System.out.print("Digite o percentual de lucro do distribuidor: ");

		perc_d = entrada.nextDouble();

		System.out.print("Digite o percentual de impostos: ");

		perc_i = entrada.nextDouble();

		vlr_d = p_fab * perc_d / 100;

		vlr_i = p_fab * perc_i / 100;

		p_final = p_fab + vlr_d + vlr_i;

		System.out.println("O lucro do distribuidor é " + vlr_d);

		System.out.println("O valor dos impostos é " + vlr_i);

		System.out.println("O preço final do veículo ao consumidor é " + p_final);

	}

}
