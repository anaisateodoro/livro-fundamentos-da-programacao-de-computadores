package capituloquatro;

import java.util.Scanner;

public class ExercicioQuinzeCapQuatro {

	public static void main(String[] args) {
		double sal_min, nht, nhet, sal_receber, vh, smes, vdep, vhe, imp = 0, sbruto, sliq, grat = 0;
		int ndep;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o valor do salário mínimo");

		sal_min = entrada.nextDouble();

		System.out.println("Digite o número de horas trabalhadas");

		nht = entrada.nextDouble();

		System.out.println("Digite o número de dependentes ");

		ndep = entrada.nextInt();

		System.out.println("Digite o número de horas extras trabalhadas ");

		nhet = entrada.nextDouble();

		vh = sal_min * 1 / 5;

		smes = nht * vh;

		vdep = ndep * 32;

		vhe = nhet * (vh + (vh * 50 / 100));

		sbruto = smes + vdep + vhe;

		if (sbruto < 200)
			imp = 0;
		if (sbruto >= 200 && sbruto <= 500)
			imp = sbruto * 10 / 100;
		if (sbruto > 500)
			imp = sbruto * 20 / 100;

		sliq = sbruto - imp;

		if (sliq <= 350)
			grat = 100;
		if (sliq > 350)
			grat = 50;

		sal_receber = sliq + grat;

		System.out.println("Salário a receber = " + sal_receber);

	}

}
