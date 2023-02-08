package capitulotres;

import java.util.Scanner;

public class ExercicioCincoCapTres {

	public static void main(String[] args) {
		double sal, perc, aumento, novosal;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o salário do funcionário: ");

		sal = entrada.nextDouble();

		System.out.println("Digite o percentual de aumento: ");

		perc = entrada.nextDouble();

		aumento = sal * perc / 100;

		System.out.println("Aumento = " + aumento);

		novosal = sal + aumento;

		System.out.println("Novo salário = " + novosal);

	}

}
