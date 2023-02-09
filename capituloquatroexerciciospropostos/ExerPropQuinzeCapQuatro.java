package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropQuinzeCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int tipo, porcentagem;
		float vlInvestimento, rendimento;
		String descricao;

		System.out.print("\nQue tipo de investimento deseja realizar?\n1 - Poupança\n2 - Fundos de Renda Fixa\n<< ");
		tipo = entrada.nextInt();

		if (tipo == 1 || tipo == 2) {

			System.out.print("Digite o valor que deseja investir: ");
			vlInvestimento = entrada.nextFloat();

			if (vlInvestimento > 0) {

				if (tipo == 1) {
					descricao = "Poupança";
					porcentagem = 3;
				} else {
					descricao = "Fundos de renda fixa";
					porcentagem = 5;
				}

				rendimento = vlInvestimento + ((vlInvestimento * porcentagem) / 100);

				System.out.println("\nInvestimento do tipo: " + descricao + "");
				System.out.println("Rendimento de " + porcentagem + "%: R$ " + casas.format(rendimento) + "\n");
			} else {
				System.out.println("\nValor do investimento, inválido!\n");
			}
		} else {
			System.out.println("\nTipo de investimento, inválido!\n");
		}

	}

}
