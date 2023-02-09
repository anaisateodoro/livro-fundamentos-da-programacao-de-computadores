package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropQuinzeCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float salario, conta1, conta2, multa1, multa2;

		System.out.print("Digite o seu salário: ");
		salario = entrada.nextFloat();
		System.out.println("Digite o valor das duas contas: ");
		conta1 = entrada.nextFloat();
		conta2 = entrada.nextFloat();

		multa1 = conta1 * 0.02F;
		multa2 = conta2 * 0.02F;

		System.out.println("Multa de 2% sobre a primeira conta: R$" + casas.format(multa1));
		System.out.println("Multa de 2% sobre a segunda conta: R$" + casas.format(multa2));

		multa1 = conta1 + multa1;
		multa2 = conta2 + multa2;
		salario = salario - (multa1 + multa2);

		System.out.println("Conta a pagar com multa de 2% sobre a primeira conta: R$" + casas.format(multa1));
		System.out.println("Conta a pagar com multa de 2% sobre a segunda conta: R$" + casas.format(multa2));
		System.out.println("Saldo atual: R$" + casas.format(salario));

	}

}
