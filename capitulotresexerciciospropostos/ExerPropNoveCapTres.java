package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropNoveCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		double area, baseMaior, baseMenor, altura;

		System.out.print("Digite o valor da Base maior: ");
		baseMaior = entrada.nextDouble();
		System.out.print("Digite o valor da Base menor: ");
		baseMenor = entrada.nextDouble();
		System.out.print("Digite o valor da altura: ");
		altura = entrada.nextDouble();
		// Fórmula destacada no capítulo do livro
		area = ((baseMaior + baseMenor) * altura) / 2;

		System.out.println("A = ((B + b) * h) / 2\nA = ((" + baseMaior + " + " + baseMenor + ") * " + altura
				+ ") / 2\nA = " + area + "cm");

		entrada.close();

	}

}
