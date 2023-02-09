package capituloquatroexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteCincoCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		int premio, horaExtra, horaFaltou, min;
		float h;

		System.out.print("\nDigite a quantidade de horas extras trabalhadas: ");
		horaExtra = entrada.nextInt();
		System.out.print("Digite a quantidade de horas que o funcionário faltou ao trabalho: ");
		horaFaltou = entrada.nextInt();

		h = horaExtra - ((2 / 3F) * horaFaltou);
		min = (int) (h * 60);

		if (min >= 2400) {
			premio = 500;
		} else if (min >= 1800 && min < 2400) {
			premio = 400;
		} else if (min >= 1200 && min < 1800) {
			premio = 300;
		} else if (min >= 600 && min < 1200) {
			premio = 200;
		} else if (min > 0 && min < 600) {
			premio = 100;
		} else {
			premio = 0;
		}

		System.out.println("\nPrêmio: R$ " + casas.format(premio) + "\n");

	}

}
