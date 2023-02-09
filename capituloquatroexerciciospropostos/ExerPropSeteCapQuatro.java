package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropSeteCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float sal, salReajustado, aumento;
		int porcentagem;

		System.out.print("\nDigite o salário: ");
		sal = entrada.nextFloat();

		if (sal > 0) {

			if (sal < 500) {
				porcentagem = 30;
				aumento = (sal * porcentagem) / 100;
				salReajustado = sal + aumento;

				System.out.println("\nAumento (" + porcentagem + "%): R$ " + casas.format(aumento));
				System.out.println("Salário reajustado: R$ " + casas.format(salReajustado) + "\n");
			} else {
				System.out.println("\nNão possui direito a um aumento\n");
			}
		} else {
			System.out.println("\nSalário inválido\n");
		}

	}

}
