package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropSeisCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		double salario, valorVendas, comissao, salarioFixo;

		System.out.print("Digite o salário fixo do funcionário: ");
		salario = entrada.nextDouble();
		System.out.print("Digite o valor das vendas: ");
		valorVendas = entrada.nextDouble();

		comissao = valorVendas * 0.04F;
		salarioFixo = salario + comissao;

		System.out.println("\ncomissão de 4%: R$" + casas.format(comissao));
		System.out.println("Salário com comissão: R$" + casas.format(salarioFixo));

		entrada.close();

	}

}
