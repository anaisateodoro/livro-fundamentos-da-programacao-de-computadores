package capitulotres;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVinteTresCapTres {

	public static void main(String[] args) {
		double a, num, f;
		int i;

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.0#########");

		System.out.print("Digite um número real: ");

		num = entrada.nextDouble();

		i = (int) num;

		f = num - i;

		a = Math.ceil(num);

		System.out.println("Parte inteira do número: " + i);

		System.out.println("Parte fracionária do número: " + casas.format(f));

		System.out.println("Arredondamento do número: " + a);

	}

}
