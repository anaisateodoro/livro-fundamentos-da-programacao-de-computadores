package capitulotres;

import java.util.Scanner;

public class ExercicioNoveCapTres {

	public static void main(String[] args) {
		double base, altura, area;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a base do triângulo: ");

		base = entrada.nextDouble();

		System.out.print("Digite a altura do triângulo: ");

		altura = entrada.nextDouble();

		area = (base * altura) / 2;

		System.out.println("Área do triângulo = " + area);

	}

}
