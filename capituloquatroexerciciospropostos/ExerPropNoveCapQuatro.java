package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropNoveCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float salMedio, credito;

		System.out.print("Digite o saldo médio: ");
		salMedio = entrada.nextFloat();

		if (salMedio > 0) {

			if (salMedio > 400) {
				credito = salMedio + salMedio * 0.3F;
			} else if (salMedio <= 400 && salMedio > 300) {
				credito = salMedio + salMedio * 0.25F;
			} else if (salMedio <= 300 && salMedio > 200) {
				credito = salMedio + salMedio * 0.2F;
			} else {
				credito = salMedio + salMedio * 0.1F;
			}

			System.out.println("\nCrédito: R$ " + casas.format(credito));
		} else {
			System.out.println("\nSaldo médio inválido");
		}

	}

}
