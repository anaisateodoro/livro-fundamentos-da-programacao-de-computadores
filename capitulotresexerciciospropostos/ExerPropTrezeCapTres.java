package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropTrezeCapTres {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int numero;

		System.out.println("Digite um número: ");
		numero = entrada.nextInt();

		// Inserção da tabuada a qualquer número digitao pelo usário
		System.out.println(numero + " X 0 = " + numero * 0);
		System.out.println(numero + " X 1 = " + numero * 1);
		System.out.println(numero + " X 2 = " + numero * 2);
		System.out.println(numero + " X 3 = " + numero * 3);
		System.out.println(numero + " X 4 = " + numero * 4);
		System.out.println(numero + " X 5 = " + numero * 5);
		System.out.println(numero + " X 6 = " + numero * 6);
		System.out.println(numero + " X 7 = " + numero * 7);
		System.out.println(numero + " X 8 = " + numero * 8);
		System.out.println(numero + " X 9 = " + numero * 9);
		System.out.println(numero + " X 10 = " + numero * 10);

		entrada.close();

	}

}
