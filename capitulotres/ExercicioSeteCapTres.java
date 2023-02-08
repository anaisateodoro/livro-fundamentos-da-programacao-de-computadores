package capitulotres;

import java.util.Scanner;

public class ExercicioSeteCapTres {

	public static void main(String[] args) {
		double sal, salreceber, imp;

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o salário do funcionário: ");

		sal = entrada.nextDouble();

		imp = sal * 10 / 100;

		salreceber = sal + 50 - imp;

		System.out.println("Novo salário = " + salreceber);

	}

}
