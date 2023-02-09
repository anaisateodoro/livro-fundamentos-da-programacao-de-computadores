package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropUmCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double num1, num2, subtracao;

		System.out.println("Digite dois números: ");
		num1 = entrada.nextDouble();
		num2 = entrada.nextDouble();

		subtracao = num1 - num2;

		System.out.println(num1 + " - " + num2 + " = " + subtracao);

		entrada.close();

	}
}
