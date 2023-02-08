package capituloquatro;

import java.util.Scanner;

public class ExercicioVinteUmCapQuatro {

	public static void main(String[] args) {
		int cod_est, cod_carga;
		double peso_toneladas, peso_quilos, pre_carga = 0, imposto = 0, valor_total;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o código do estado, um número entre 1 e 5 ");

		cod_est = entrada.nextInt();

		System.out.println("Digite o peso da carga em toneladas ");

		peso_toneladas = entrada.nextDouble();

		System.out.println("Digite o código da carga, um número entre 10 e 40 ");

		cod_carga = entrada.nextInt();

		peso_quilos = peso_toneladas * 1000;

		System.out.println("Peso em quilos = " + peso_quilos);

		if (cod_carga >= 10 && cod_carga <= 20)
			pre_carga = 100 * peso_quilos;
		if (cod_carga >= 21 && cod_carga <= 30)
			pre_carga = 250 * peso_quilos;
		if (cod_carga >= 31 && cod_carga <= 40)
			pre_carga = 340 * peso_quilos;

		System.out.println("Preço da carga = " + pre_carga);

		if (cod_est == 1)
			imposto = pre_carga * 35 / 100;
		if (cod_est == 2)
			imposto = pre_carga * 25 / 100;
		if (cod_est == 3)
			imposto = pre_carga * 15 / 100;
		if (cod_est == 4)
			imposto = pre_carga * 5 / 100;
		if (cod_est == 5)
			imposto = 0;

		System.out.println("Valor do imposto = " + imposto);

		valor_total = pre_carga + imposto;

		System.out.println("Valor total da carga = " + valor_total);

	}

}
