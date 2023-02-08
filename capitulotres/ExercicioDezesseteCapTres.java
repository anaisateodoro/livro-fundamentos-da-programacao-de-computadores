package capitulotres;

import java.util.Scanner;

public class ExercicioDezesseteCapTres {

	public static void main(String[] args) {
		double salario, cheque1, cheque2, cpmf1, cpmf2, saldo;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário recebido: ");

		salario = entrada.nextDouble();

		System.out.print("Digite o valor do 1º cheque: ");

		cheque1 = entrada.nextDouble();

		System.out.print("Digite o valor do 2º cheque: ");

		cheque2 = entrada.nextDouble();

		cpmf1 = cheque1 * 0.38 / 100;

		cpmf2 = cheque2 * 0.38 / 100;

		saldo = salario - cheque1 - cheque2 - cpmf1 - cpmf2;

		System.out.println("O valor do saldo é: " + saldo);

	}

}
