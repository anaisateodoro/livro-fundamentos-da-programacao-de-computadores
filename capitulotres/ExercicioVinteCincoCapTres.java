package capitulotres;

import java.util.Scanner;

public class ExercicioVinteCincoCapTres {

	public static void main(String[] args) {
		double custo, convite, qtd;

		Scanner entrada = new Scanner(System.in);

		System.out.print("Digite o custo do espetáculo: ");

		custo = entrada.nextFloat();

		System.out.print("Digite o preço do convite: ");

		convite = entrada.nextFloat();

		qtd = custo / convite;

		System.out.println("Quantidade de convites necessária: " + qtd);

	}

}
