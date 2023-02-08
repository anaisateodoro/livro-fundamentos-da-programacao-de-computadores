package capitulotres;

import java.util.Scanner;

public class ExercicioOitoCapTres {

	public static void main(String[] args) {
		double dep, taxa, rend, total;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o valor do depósito: ");

		dep = entrada.nextDouble();

		System.out.print("Digite a taxa de juros: ");

		taxa = entrada.nextDouble();

		rend = dep * taxa / 100;

		total = dep + rend;

		System.out.println("Rendimento = " + rend);

		System.out.println("Total = " + total);

	}

}
