package capitulotresexerciciospropostos;

import java.util.Scanner;

public class ExerPropDezoitoCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		float tempCel, tempFah;

		System.out.print("Digite uma temperatura em Celsius: ");
		tempCel = entrada.nextFloat();

		tempFah = tempCel * 1.8F + 32;

		System.out.println(tempCel + "°C = " + tempFah + "°F");

	}

}
