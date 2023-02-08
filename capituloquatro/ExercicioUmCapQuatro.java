package capituloquatro;

import java.util.Scanner;

public class ExercicioUmCapQuatro {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double notaTL;
		double notaAS;
		double notaEF;
		double mediaP;

		System.out.print("Digite a nota do trabalho de laboratório: ");
		notaTL = entrada.nextDouble();

		System.out.println("Digite a nota da avaliaçao semestral: ");
		notaAS = entrada.nextDouble();

		System.out.println("Digite a nota do exame final: ");
		notaEF = entrada.nextDouble();

		mediaP = (notaTL * 2 + notaAS * 3 + notaEF * 5) / (2 + 3 + 5);

		if (mediaP >= 8.0 && mediaP <= 10) {
			System.out.println("Conceito A");
		}

		else if (mediaP >= 7 && mediaP < 8.0) {
			System.out.println("Conceito B");

		} else if (mediaP >= 6 && mediaP < 7.0) {
			System.out.println("Conceito C");

		}

		else if (mediaP >= 5 && mediaP < 6.0) {
			System.out.println("Conceito D");

		} else if (mediaP >= 0 && mediaP < 5.0) {
			System.out.println("Conceito E");

		}

	}

}
