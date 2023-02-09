package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropOnzeCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.000");
		float area, diagonalMaior, diagonalMenor;

		diagonalMaior = entrada.nextFloat();
		System.out.print("Digite o valor da diagonal menor: ");
		diagonalMenor = entrada.nextFloat();

		area = (diagonalMaior * diagonalMenor) / 2;

		System.out.println("A = (D * d) / 2\nA = (" + diagonalMaior + " * " + diagonalMenor + ") / 2\nA = "
				+ casas.format(area) + " cm");

	}

}
