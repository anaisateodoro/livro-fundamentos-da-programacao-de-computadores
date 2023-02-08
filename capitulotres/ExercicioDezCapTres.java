package capitulotres;

import java.util.Scanner;

public class ExercicioDezCapTres {

	public static void main(String[] args) {
		Double area, raio;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o raio: ");

		raio = entrada.nextDouble();

		area = 3.1415 * raio * raio;

		System.out.println("Área do círculo = " + area);

	}

}
