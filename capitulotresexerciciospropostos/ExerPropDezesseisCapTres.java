package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezesseisCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float hipotenusa, catOposto, catAdjacente;

		System.out.print("Digite o valor do Cateto Oposto: ");
		catOposto = entrada.nextFloat();
		System.out.print("Digite o valor do Cateto Adjacente: ");
		catAdjacente = entrada.nextFloat();

		hipotenusa = (float) (Math.pow(catOposto, 2) + Math.pow(catAdjacente, 2));
		hipotenusa = (float) Math.sqrt(hipotenusa);

		System.out.println("c² = a² + b²\nc² = " + catOposto + "² + " + catAdjacente + "²\nc = " + hipotenusa);

	}

}
