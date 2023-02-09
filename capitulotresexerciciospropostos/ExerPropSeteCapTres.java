package capitulotresexerciciospropostos;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropSeteCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0");
		double pesoQ, pesoG;

		System.out.print("Digite seu peso em quilos: ");
		pesoQ = entrada.nextDouble();

		pesoG = pesoQ * 1000;

		System.out.println(pesoQ + " Kg -> convertendo em gramas: " + casas.format(pesoG)+"gramas:");

		entrada.close();

	}

}
