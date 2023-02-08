package capituloquatro;

import java.util.Scanner;

public class ExercicioTrezeCapQuatro {

	public static void main(String[] args) {
		double sal, imp = 0, aum = 0, novo_sal;
		int op;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Menu de Opções");
		System.out.println("1 - Imposto");
		System.out.println("2 - Novo Salário");
		System.out.println("3 - Classificação");
		System.out.println("Digite a opção desejada");

		op = entrada.nextInt();
		if (op == 1) {
			System.out.println("Digite o valor do salário");
			entrada = new Scanner(System.in);
			sal = entrada.nextDouble();
			if (sal < 500)
				imp = sal * 5 / 100;
			if (sal >= 500 && sal <= 850)
				imp = sal * 10 / 100;
			if (sal > 850)
				imp = sal * 15 / 100;
			System.out.println("Valor do Imposto = " + imp);
		}
		if (op == 2) {
			System.out.println("Digite o valor do salário");
			entrada = new Scanner(System.in);
			sal = entrada.nextDouble();
			if (sal > 1500)
				aum = 25;
			if (sal >= 750 && sal <= 1500)
				aum = 50;
			if (sal >= 450 && sal < 750)
				aum = 75;
			if (sal < 450)
				aum = 100;
			novo_sal = sal + aum;
			System.out.println("Valor do Novo Salário = " + novo_sal);
		}
		if (op == 3) {
			System.out.println("Digite o valor do salário");
			entrada = new Scanner(System.in);
			sal = entrada.nextDouble();
			if (sal <= 700)
				System.out.println("Mal Remunerado");
			if (sal > 700)
				System.out.println("Bem Remunerado");
		}
		if (op < 1 || op > 3)
			System.out.println("Opção Inválida");

	}

}
