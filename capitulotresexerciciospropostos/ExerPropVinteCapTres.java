package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropVinteCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float angBase, distancia, hipotenusa;

		System.out.print("Digite o ângulo: ");
		angBase = entrada.nextFloat();
		System.out.print("Digite a distância: ");
		distancia = entrada.nextFloat();

		hipotenusa = (float) (distancia / Math.cos(angBase));

		System.out.println("\nMedida da escada: " + casas.format(hipotenusa) + "m");

	}

}
