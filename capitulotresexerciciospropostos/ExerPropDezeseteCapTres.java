package capitulotresexerciciospropostos;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerPropDezeseteCapTres {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");
		float raio, comprimento, area, volume;

		System.out.print("Digite o raio: ");
		raio = entrada.nextFloat();

		comprimento = (float) (2 * Math.PI * raio);
		area = (float) (Math.PI * Math.pow(raio, 2));
		volume = (float) (4 * Math.PI * Math.pow(raio, 3)) / 3;

		System.out.println("\nC = 2 * π * R\nC = 2 * " + casas.format(Math.PI) + " * " + raio + "\nC = "
				+ casas.format(comprimento));
		System.out
				.println("\nA = π * R²\nA = " + casas.format(Math.PI) + " * " + raio + "²\nA = " + casas.format(area));
		System.out.println("\nV = (4 * π * raio³) / 3\nV = (4 * " + casas.format(Math.PI) + " * " + raio
				+ "³) / 3\nV = " + casas.format(volume));
	}

}
