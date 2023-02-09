package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double lado, area;

		System.out.print("Digite o valor do lado: ");
		lado = entrada.nextFloat();

		area = (double) Math.pow(lado, 2);

		System.out.println("A = L * L\nA = " + lado + " * " + lado + "\nA = " + area + " cm");

		entrada.close();

	}

}
