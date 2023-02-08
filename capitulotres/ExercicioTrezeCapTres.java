package capitulotres;

import java.util.Scanner;

public class ExercicioTrezeCapTres {

	public static void main(String[] args) {
		double pes, polegadas, jardas, milhas;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite a medida em pés ");

		pes = entrada.nextDouble();

		polegadas = pes * 12;

		jardas = pes / 3;

		milhas = jardas / 1760;

		System.out.println("Medida em polegadas = " + polegadas);

		System.out.println("Medida em jardas = " + jardas);

		System.out.println("Medida em milhas = " + milhas);

	}

}
