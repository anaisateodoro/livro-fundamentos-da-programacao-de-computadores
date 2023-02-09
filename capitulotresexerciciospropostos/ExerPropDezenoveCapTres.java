package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDezenoveCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float dimen1, dimen2, area, pot;

		System.out.println("Digite as dimensões em metros de um cômodo: ");
		dimen1 = entrada.nextFloat();
		dimen2 = entrada.nextFloat();

		area = dimen1 * dimen2;
		pot = 18 * area;

		System.out.println("Área do cômodo: " + casas.format(area) + "m²");
		System.out.println("Potêcia necessária: " + casas.format(pot) + "W");

	}

}
