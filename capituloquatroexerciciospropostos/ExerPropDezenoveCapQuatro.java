package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDezenoveCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float altura, peso;
		char sexo;

		System.out.print("\nQual o seu sexo?\nM - Masculino\nF - Feminino\n<< ");
		sexo = entrada.nextLine().charAt(0);
		sexo = Character.toLowerCase(sexo);

		if (sexo == 'm' || sexo == 'f') {

			System.out.print("Digite sua altura: ");
			altura = entrada.nextFloat();

			if (altura >= 0.7F) {

				if (sexo == 'm') {
					peso = (float) ((72.7 * altura) - 58);
				} else {
					peso = (float) ((62.1 * altura) - 44.7);
				}

				System.out.println("\nSeu peso ideal é " + casas.format(peso) + " kg\n");
			} else {
				System.out.println("\nAltura pequena demais\n");
			}
		} else {
			System.out.println("\nSexo, inválido!\n");
		}

	}

}
