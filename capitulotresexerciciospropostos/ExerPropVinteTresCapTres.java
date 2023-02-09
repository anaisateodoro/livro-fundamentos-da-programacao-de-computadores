package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropVinteTresCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float ang1, ang2, ang3;

		System.out.println("\nDigite a medida de dois ângulos: ");
		ang1 = entrada.nextFloat();
		ang2 = entrada.nextFloat();

		ang3 = Math.abs(ang1 + ang2 - 180);

		System.out.println("\nMedida do terceiro ângulo: " + ang3);
	}

}
