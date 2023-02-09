package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropOitoCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float sal, salReajustado, aumento;
		int porcentagem;

		System.out.print("Digite o salário: ");
		sal = entrada.nextFloat();

		if (sal > 0) {

			if (sal <= 300) {
				porcentagem = 35;
			} else {
				porcentagem = 15;
			}

			aumento = (sal * porcentagem) / 100;
			salReajustado = sal + aumento;

			System.out.println("Novo salário: R$ " + casas.format(salReajustado));
		} else {
			System.out.println("Salário inválido");
		}

	}

}
