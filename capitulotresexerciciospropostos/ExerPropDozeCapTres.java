package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDozeCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double salarioMinimo, salarioFunncionario, quantidade;

		System.out.print("Digite o valor do salário mínimo: ");
		salarioMinimo = entrada.nextDouble();
		System.out.print("Digite o valor do salário do funcionário: ");
		salarioFunncionario = entrada.nextDouble();

		quantidade = salarioFunncionario / salarioMinimo;

		System.out.println("Quantidade de salário(s) mínimo(s) que o funcionário recebe: " + casas.format(quantidade));

		entrada.close();

	}

}
