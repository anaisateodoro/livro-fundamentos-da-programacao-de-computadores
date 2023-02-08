package capituloquatro;

import java.text.DecimalFormat;
import java.util.Scanner;

public class ExercicioVinteTresCapQuatro {

	public static void main(String[] args) {
		double sal_min, nht, coeficiente = 0, sal_bruto, imposto, grat, auxilio, sal_liq;
		char turno, categoria;
		Scanner entrada = new Scanner(System.in);
		DecimalFormat casas = new DecimalFormat("0.00");

		System.out.println("Digite o valor do salário mínimo");

		sal_min = entrada.nextDouble();

		System.out.println("Digite o turno de trabalho (M, V ou N) ");

		turno = entrada.next().charAt(0);

		System.out.println("Digite a categoria do trabalhador (O ou G) ");

		categoria = entrada.next().charAt(0);

		System.out.println("Digite o número de horas trabalhadas");

		nht = entrada.nextDouble();

		if (turno == 'M')
			coeficiente = sal_min * 10 / 100;
		if (turno == 'V')
			coeficiente = sal_min * 15 / 100;
		if (turno == 'N')
			coeficiente = sal_min * 12 / 100;

		System.out.println("Valor do Coeficiente = " + casas.format(coeficiente));

		sal_bruto = nht * coeficiente;

		System.out.println("Valor do salário bruto = " + casas.format(sal_bruto));

		if (categoria == 'O') {
			if (sal_bruto >= 300)
				imposto = sal_bruto * 5 / 100;
			else
				imposto = sal_bruto * 3 / 100;
		} else {
			if (sal_bruto >= 400)
				imposto = sal_bruto * 6 / 100;
			else
				imposto = sal_bruto * 4 / 100;
		}

		System.out.println("Valor do imposto = " + casas.format(imposto));

		if (turno == 'N' && nht > 80)
			grat = 50;
		else
			grat = 30;

		System.out.println("Gratificação = " + casas.format(grat));

		if (categoria == 'O' || coeficiente <= 25)
			auxilio = sal_bruto * 1 / 3;
		else
			auxilio = sal_bruto * 1 / 2;

		System.out.println("Valor do auxílio alimentação = " + casas.format(auxilio));

		sal_liq = sal_bruto - imposto + grat + auxilio;

		System.out.println("Valor do salário líquido = " + casas.format(sal_liq));

		if (sal_liq < 350)
			System.out.println("Mal Remunerado");
		if (sal_liq >= 350 && sal_liq <= 600)
			System.out.println("Normal");
		if (sal_liq > 600)
			System.out.println("Bem Remunerado");

	}

}
