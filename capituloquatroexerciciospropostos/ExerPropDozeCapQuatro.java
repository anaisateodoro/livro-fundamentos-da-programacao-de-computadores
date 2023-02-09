package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDozeCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float salBruto, imposto, salNovo;
		int gratificacao;

		System.out.print("Digite o salário bruto: ");
		salBruto = entrada.nextFloat();

		if (salBruto > 0) {

			if (salBruto <= 350) {
				gratificacao = 100;
			} else if (salBruto > 350 && salBruto < 600) {
				gratificacao = 75;
			} else if (salBruto >= 600 && salBruto <= 900) {
				gratificacao = 50;
			} else {
				gratificacao = 35;
			}

			imposto = salBruto * 0.07F;
			salNovo = salBruto + gratificacao - imposto;

			System.out.println("\nGratificação: R$ " + casas.format(gratificacao));
			System.out.println("Imposto (7%): R$ " + casas.format(imposto));
			System.out.println("\nSalário a receber: R$ " + casas.format(salNovo));
		} else {
			System.out.println("\nSalário bruto, inválido!");
		}

	}

}
