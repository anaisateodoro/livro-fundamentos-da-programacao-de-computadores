package capituloquatro;

import java.util.Scanner;

public class ExercicioVinteDoisCapQuatro {

	public static void main(String[] args) {
		int tempo;
		double sal_base, imposto, grat, sal_liq;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o salário base do funcionário");

		sal_base = entrada.nextDouble();

		System.out.println("Digite o tempo de serviço do funcionário");

		tempo = entrada.nextInt();

		if (sal_base < 200)
			imposto = 0;
		else if (sal_base <= 450)
			imposto = sal_base * 3 / 100;
		else if (sal_base < 700)
			imposto = sal_base * 0.08;
		else
			imposto = sal_base * 0.12;

		System.out.println("Imposto =  " + imposto);

		if (sal_base > 500) {
			if (tempo <= 3)
				grat = 20;
			else
				grat = 30;
		} else {
			if (tempo <= 3)
				grat = 23;
			else if (tempo < 6)
				grat = 35;
			else
				grat = 33;
		}

		System.out.println("Gratificação = " + grat);

		sal_liq = sal_base - imposto + grat;

		System.out.println("Salário líquido = " + sal_liq);

		if (sal_liq <= 350)
			System.out.println("Classificação A ");
		else if (sal_liq < 600)
			System.out.println("Classificação B ");
		else
			System.out.println("Classificação C");

	}

}
