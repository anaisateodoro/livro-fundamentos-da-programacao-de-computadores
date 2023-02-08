package capituloquatro;

import java.util.Scanner;

public class ExercicioVinteCapQuatro {

	public static void main(String[] args) {
		int cod_prod, cod_pais;
		double peso_quilos, peso_gramas, pre_total, imposto = 0, valor_total, pre_grama = 0;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o código do produto, um número entre 1 e 10 ");

		cod_prod = entrada.nextInt();

		System.out.println("Digite o peso do produto em quilos ");

		peso_quilos = entrada.nextDouble();

		System.out.println("Digite o código do país, um número entre 1 e 3 ");

		cod_pais = entrada.nextInt();

		peso_gramas = peso_quilos * 1000;

		System.out.println("Peso em gramas = " + peso_gramas);

		switch (cod_prod) {
		case 1:
			pre_grama = 10;
			break;
		case 2:
			pre_grama = 10;
			break;
		case 3:
			pre_grama = 10;
			break;
		case 4:
			pre_grama = 10;
			break;
		case 5:
			pre_grama = 25;
			break;
		case 6:
			pre_grama = 25;
			break;
		case 7:
			pre_grama = 25;
			break;
		case 8:
			pre_grama = 35;
			break;
		case 9:
			pre_grama = 35;
			break;
		case 10:
			pre_grama = 35;
			break;
		}

		pre_total = peso_gramas * pre_grama;

		System.out.println("Preço total = " + pre_total);

		switch (cod_pais) {
		case 1:
			imposto = 0;
			break;
		case 2:
			imposto = pre_total * 15 / 100;
			break;
		case 3:
			imposto = pre_total * 25 / 100;
			break;
		}

		System.out.println("Imposto = " + imposto);

		valor_total = pre_total + imposto;

		System.out.println("Valor Total = " + valor_total);

	}

}
