package capitulotres;

import java.util.Scanner;

public class ExercicioSeisCapTres {

	public static void main(String[] args) {
		double sal, salreceber, grat, imp;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o salário do funcionário: ");

		sal = entrada.nextDouble();

		grat = sal * 5 / 100;

		imp = sal * 7 / 100;

		salreceber = sal + grat - imp;

		System.out.println("Novo salário = " + salreceber);

	}

}
